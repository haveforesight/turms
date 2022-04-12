/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.turms.service.domain.user.access.admin.controller;

import im.turms.server.common.access.admin.permission.AdminPermission;
import im.turms.server.common.access.admin.permission.RequiredPermission;
import im.turms.server.common.access.client.dto.constant.DeviceType;
import im.turms.server.common.access.client.dto.constant.UserStatus;
import im.turms.server.common.domain.common.dto.response.ResponseDTO;
import im.turms.server.common.domain.common.dto.response.ResponseFactory;
import im.turms.server.common.domain.location.bo.NearbyUser;
import im.turms.server.common.domain.session.bo.SessionCloseStatus;
import im.turms.server.common.domain.session.bo.UserSessionsStatus;
import im.turms.server.common.domain.session.service.SessionLocationService;
import im.turms.server.common.domain.session.service.UserStatusService;
import im.turms.server.common.infra.cluster.node.Node;
import im.turms.server.common.infra.collection.CollectorUtil;
import im.turms.service.domain.common.access.admin.controller.BaseController;
import im.turms.service.domain.observation.service.StatisticsService;
import im.turms.service.domain.user.access.admin.dto.request.UpdateOnlineStatusDTO;
import im.turms.service.domain.user.access.admin.dto.response.OnlineUserCountDTO;
import im.turms.service.domain.user.access.admin.dto.response.UserLocationDTO;
import im.turms.service.domain.user.service.UserService;
import im.turms.service.domain.user.service.onlineuser.SessionService;
import im.turms.service.domain.user.service.onlineuser.UsersNearbyService;
import org.springframework.data.geo.Point;
import org.springframework.data.util.Pair;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @author James Chen
 */
@RestController
@RequestMapping("/users/online-infos")
public class UserOnlineInfoController extends BaseController {

    private final UserService userService;
    private final StatisticsService statisticsService;
    private final SessionLocationService sessionLocationService;
    private final UserStatusService userStatusService;
    private final UsersNearbyService usersNearbyService;
    private final SessionService sessionService;

    public UserOnlineInfoController(
            Node node,
            UserService userService,
            StatisticsService statisticsService,
            SessionLocationService sessionLocationService,
            UserStatusService userStatusService,
            UsersNearbyService usersNearbyService,
            SessionService sessionService) {
        super(node);
        this.userService = userService;
        this.statisticsService = statisticsService;
        this.sessionLocationService = sessionLocationService;
        this.userStatusService = userStatusService;
        this.usersNearbyService = usersNearbyService;
        this.sessionService = sessionService;
    }

    @GetMapping("/count")
    @RequiredPermission(AdminPermission.STATISTICS_USER_QUERY)
    public Mono<ResponseEntity<ResponseDTO<OnlineUserCountDTO>>> countOnlineUsers(
            @RequestParam(required = false, defaultValue = "false") boolean countByNodes) {
        if (!countByNodes) {
            return ResponseFactory.okIfTruthy(statisticsService.countOnlineUsers()
                    .map(total -> new OnlineUserCountDTO(total, null)));
        }
        return ResponseFactory.okIfTruthy(statisticsService.countOnlineUsersByNodes()
                .map(nodeIdToUserCount -> {
                    int sum = 0;
                    for (int onlineUserCount : nodeIdToUserCount.values()) {
                        sum += onlineUserCount;
                    }
                    return new OnlineUserCountDTO(sum, nodeIdToUserCount);
                }));
    }

    @GetMapping("/statuses")
    @RequiredPermission(AdminPermission.USER_ONLINE_INFO_QUERY)
    public Mono<ResponseEntity<ResponseDTO<Collection<UserSessionsStatus>>>> queryOnlineUsersStatus(
            @RequestParam Set<Long> ids,
            @RequestParam(defaultValue = "true") boolean checkIfExists) {
        List<Mono<UserSessionsStatus>> userSessionStatusMonos = new ArrayList<>(ids.size());
        for (Long userId : ids) {
            Mono<UserSessionsStatus> userOnlineInfoMno = userStatusService.getUserSessionsStatus(userId)
                    .flatMap(info -> {
                        if (info.getUserStatus(false) == UserStatus.OFFLINE && checkIfExists) {
                            return userService.checkIfUserExists(userId, false)
                                    .flatMap(exists -> exists
                                            ? Mono.just(info)
                                            : Mono.empty());
                        }
                        return Mono.just(info);
                    });
            userSessionStatusMonos.add(userOnlineInfoMno);
        }
        return ResponseFactory.okIfTruthy(Flux.merge(userSessionStatusMonos));
    }

    @GetMapping("/nearby-users")
    @RequiredPermission(AdminPermission.USER_ONLINE_INFO_QUERY)
    public Mono<ResponseEntity<ResponseDTO<List<NearbyUser>>>> queryUsersNearby(
            @RequestParam Long userId,
            @RequestParam(required = false) DeviceType deviceType,
            @RequestParam(required = false) Short maxNumber,
            @RequestParam(required = false) Integer maxDistance,
            @RequestParam(defaultValue = "false") boolean withCoordinates,
            @RequestParam(defaultValue = "false") boolean withDistance,
            @RequestParam(defaultValue = "false") boolean withUserInfo) {
        Mono<List<NearbyUser>> usersNearby = usersNearbyService
                .queryNearbyUsers(userId, deviceType, null, maxNumber, maxDistance, withCoordinates, withDistance, withUserInfo);
        return ResponseFactory.okIfTruthy(usersNearby);
    }

    @GetMapping("/locations")
    @RequiredPermission(AdminPermission.USER_ONLINE_INFO_QUERY)
    public Mono<ResponseEntity<ResponseDTO<List<UserLocationDTO>>>> queryUserLocations(
            @RequestParam Set<Long> ids,
            @RequestParam(required = false) DeviceType deviceType) {
        List<Mono<Pair<Long, Point>>> monos = new ArrayList<>(ids.size());
        for (Long userId : ids) {
            monos.add(sessionLocationService.getUserLocation(userId, deviceType)
                    .map(coordinates -> Pair.of(userId, new Point(coordinates.getX().doubleValue(), coordinates.getY().doubleValue()))));
        }
        Mono<List<UserLocationDTO>> resultMono = Flux.merge(monos)
                .collect(CollectorUtil.toList(monos.size()))
                .map(pairs -> {
                    List<UserLocationDTO> userLocations = new ArrayList<>(pairs.size());
                    for (Pair<Long, Point> pair : pairs) {
                        userLocations.add(new UserLocationDTO(pair.getFirst(), deviceType, pair.getSecond()));
                    }
                    return userLocations;
                });
        return ResponseFactory.okIfTruthy(resultMono);
    }

    @PutMapping("/statuses")
    @RequiredPermission(AdminPermission.USER_ONLINE_INFO_UPDATE)
    public Mono<ResponseEntity<ResponseDTO<Void>>> updateUserOnlineStatus(
            @RequestParam Set<Long> ids,
            @RequestParam(required = false) Set<DeviceType> deviceTypes,
            @RequestBody UpdateOnlineStatusDTO updateOnlineStatusDTO) {
        Mono<Boolean> updateMono;
        UserStatus onlineStatus = updateOnlineStatusDTO.onlineStatus();
        if (onlineStatus == UserStatus.OFFLINE) {
            updateMono = deviceTypes == null
                    ? sessionService.disconnect(ids, SessionCloseStatus.DISCONNECTED_BY_ADMIN)
                    : sessionService.disconnect(ids, deviceTypes, SessionCloseStatus.DISCONNECTED_BY_ADMIN);
        } else {
            updateMono = userStatusService.updateOnlineUsersStatus(ids, onlineStatus);
        }
        return updateMono.thenReturn(ResponseFactory.OK);
    }

}
