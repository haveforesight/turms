import { im } from "../model/proto-bundle";
import { ParsedNotification } from "../model/parsed-notification";
import TurmsNotification = im.turms.proto.TurmsNotification;
import UserStatus = im.turms.proto.UserStatus;
import DeviceType = im.turms.proto.DeviceType;
export default class TurmsDriver {
    private _heartbeatInterval;
    private _websocket;
    private _heartbeatTimer?;
    private _onNotificationListeners;
    private _onClose?;
    private _url;
    private _httpUrl;
    private _connectionTimeout;
    private _requestTimeout;
    private _minRequestsInterval;
    private _requestsMap;
    private _lastRequestDate;
    private _queryReasonWhenLoginFailed;
    private _queryReasonWhenDisconnected;
    private _userId;
    private _password;
    private _location;
    private _userOnlineStatus;
    private _deviceType;
    private _requestId;
    private _sessionId?;
    private _address?;
    constructor(url?: string, connectionTimeout?: number, requestTimeout?: number, minRequestsInterval?: number, httpUrl?: string, queryReasonWhenLoginFailed?: boolean, queryReasonWhenDisconnected?: boolean);
    set onClose(value: any);
    get onNotificationListeners(): ((notification: ParsedNotification) => void)[];
    sendHeartbeat(): Promise<void>;
    connected(): boolean;
    disconnect(): Promise<void>;
    private _connect;
    connect(userId: string, password: string, location?: string, userOnlineStatus?: UserStatus, deviceType?: DeviceType): Promise<void>;
    resetHeartBeatTimer(): void;
    send(message: im.turms.proto.ITurmsRequest): Promise<TurmsNotification>;
    private static _fillLoginInfo;
    private static _clearLoginInfo;
    private _generateRandomId;
    private _onWebsocketOpen;
    private _onWebsocketClose;
    reconnect(host?: string): Promise<void>;
}
