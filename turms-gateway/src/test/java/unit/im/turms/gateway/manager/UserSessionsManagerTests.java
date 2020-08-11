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

package unit.im.turms.gateway.manager;

import im.turms.common.constant.DeviceType;
import im.turms.common.constant.UserStatus;
import im.turms.gateway.manager.UserSessionsManager;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.socket.CloseStatus;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author James Chen
 */
class UserSessionsManagerTests {

    private final long userId = 1L;
    private final UserStatus userStatus = UserStatus.AVAILABLE;
    private final DeviceType deviceType = DeviceType.ANDROID;

    @Test
    void constructor_shouldSucceed_ifRequiredParamsExist() {
        UserSessionsManager manager = new UserSessionsManager(userId, userStatus, deviceType, null, null, 0, null);
        assertNotNull(manager);
    }

    @Test
    void constructor_shouldThrow_ifRequiredParamsNotExist() {
        assertThrows(IllegalArgumentException.class, () ->
                new UserSessionsManager(null, userStatus, deviceType, null, null, 0, null));
        assertThrows(IllegalArgumentException.class, () ->
                new UserSessionsManager(userId, null, deviceType, null, null, 0, null));
        assertThrows(IllegalArgumentException.class, () ->
                new UserSessionsManager(userId, userStatus, null, null, null, 0, null));
    }

    @Test
    void setDeviceOffline_shouldSucceed() {
        UserSessionsManager manager = new UserSessionsManager(userId, userStatus, deviceType, null, null, 0, null);
        WebSocketSession session = mock(WebSocketSession.class);
        when(session.close(any())).thenReturn(Mono.empty());
        manager.getSession(deviceType).setWebSocketSession(session);

        assertEquals(1, manager.getSessionMap().size());
        manager.setDeviceOffline(deviceType, CloseStatus.NORMAL);
        assertEquals(0, manager.getSessionMap().size());
    }

    @Test
    void pushSessionNotification_shouldReturnTrue_ifSessionExists() {
        UserSessionsManager manager = new UserSessionsManager(userId, userStatus, deviceType, null, null, 0, null);
        assertTrue(manager.pushSessionNotification(deviceType));
    }

    @Test
    void pushSessionNotification_shouldReturnFalse_ifSessionNotExists() {
        UserSessionsManager manager = new UserSessionsManager(userId, userStatus, DeviceType.ANDROID, null, null, 0, null);
        assertFalse(manager.pushSessionNotification(DeviceType.IOS));
    }

    @Test
    void getSession_shouldReturnSession() {
        UserSessionsManager manager = new UserSessionsManager(userId, userStatus, deviceType, null, null, 0, null);
        assertNotNull(manager.getSession(deviceType));
    }

    @Test
    void getSessionsNumber_shouldBeThree_forThreeSessions() {
        UserSessionsManager manager = new UserSessionsManager(userId, userStatus, DeviceType.ANDROID, null, null, 0, null);
        manager.addSessionIfAbsent(DeviceType.IOS, null, null, 1);
        manager.addSessionIfAbsent(DeviceType.DESKTOP, null, null, 1);
        assertEquals(3, manager.getSessionsNumber());
    }

    @Test
    void getLoggedInDeviceTypes_shouldBeSame() {
        UserSessionsManager manager = new UserSessionsManager(userId, userStatus, DeviceType.ANDROID, null, null, 0, null);
        manager.addSessionIfAbsent(DeviceType.IOS, null, null, 1);
        manager.addSessionIfAbsent(DeviceType.DESKTOP, null, null, 1);

        Set<DeviceType> loggedInDeviceTypes = manager.getLoggedInDeviceTypes();

        assertTrue(loggedInDeviceTypes.contains(DeviceType.ANDROID));
        assertTrue(loggedInDeviceTypes.contains(DeviceType.IOS));
        assertTrue(loggedInDeviceTypes.contains(DeviceType.DESKTOP));
    }

}