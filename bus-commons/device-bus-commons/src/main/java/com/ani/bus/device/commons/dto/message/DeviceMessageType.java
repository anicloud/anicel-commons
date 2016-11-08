package com.ani.bus.device.commons.dto.message;

/**
 * Created by huangbin on 10/27/15.
 * Modified by xuben on 11/08/16.
 */
public enum DeviceMessageType {
    REGISTER_REQUEST(0),
    REGISTER_RESPONSE(1),
    AUTH_REQUEST(2),
    AUTH_RESPONSE(3),
    UPDATE_REQUEST(4),
    UPDATE_RESPONSE(5),
    INVOKE_REQUEST(6),
    INVOKE_RESPONSE(7),
    TIME_SYNC_REQUEST(8),
    TIME_SYNC_RESPONSE(9),
    INVOKE_SERVICE(10),
    UNKNOWN(11);

    private Integer value;

    DeviceMessageType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static DeviceMessageType getType(Integer value) {
        switch (value) {
            case 0:
                return REGISTER_REQUEST;
            case 1:
                return REGISTER_RESPONSE;
            case 2:
                return AUTH_REQUEST;
            case 3:
                return AUTH_RESPONSE;
            case 4:
                return UPDATE_REQUEST;
            case 5:
                return UPDATE_RESPONSE;
            case 6:
                return INVOKE_REQUEST;
            case 7:
                return INVOKE_RESPONSE;
            case 8:
                return TIME_SYNC_REQUEST;
            case 9:
                return TIME_SYNC_RESPONSE;
            case 10:
                return INVOKE_SERVICE;
            default:
                return UNKNOWN;
        }
    }
}
