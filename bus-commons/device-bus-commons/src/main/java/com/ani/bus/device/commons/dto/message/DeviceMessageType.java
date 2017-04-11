package com.ani.bus.device.commons.dto.message;

/**
 * Created by huangbin on 15/10/27
 * Modified by xuben on 17/04/08
 */
public enum DeviceMessageType {
    REGISTER_REQUEST(1),
    REGISTER_RESPONSE(2),
    AUTH_REQUEST(3),
    AUTH_RESPONSE(4),
    UPDATE_REQUEST(5),
    UPDATE_RESPONSE(6),
    INVOKE_REQUEST(7),
    INVOKE_RESPONSE(8),
    TIME_SYNC_REQUEST(9),
    TIME_SYNC_RESPONSE(10),
    STATE_OBJECT_REQUEST(11),
    STATE_OBJECT_RESPONSE(12),
    STATES_OBJECT_REQUEST(13),
    STATES_OBJECT_RESPONSE(14),
    STATE_UPDATE_REQUEST(15),
    STATE_UPDATE_RESPONSE(16),
    STATE_REQUEST(17),
    STATE_RESPONSE(18),
    INVOKE_SERVICE(19),
    UNKNOWN(20);

    private Integer value;

    DeviceMessageType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static DeviceMessageType getType(Integer value) {
        switch (value) {
            case 1:
                return REGISTER_REQUEST;
            case 2:
                return REGISTER_RESPONSE;
            case 3:
                return AUTH_REQUEST;
            case 4:
                return AUTH_RESPONSE;
            case 5:
                return UPDATE_REQUEST;
            case 6:
                return UPDATE_RESPONSE;
            case 7:
                return INVOKE_REQUEST;
            case 8:
                return INVOKE_RESPONSE;
            case 9:
                return TIME_SYNC_REQUEST;
            case 10:
                return TIME_SYNC_RESPONSE;
            case 11:
                return STATE_OBJECT_REQUEST;
            case 12:
                return STATE_OBJECT_RESPONSE;
            case 13:
                return STATES_OBJECT_REQUEST;
            case 14:
                return STATES_OBJECT_RESPONSE;
            case 15:
                return STATE_UPDATE_REQUEST;
            case 16:
                return STATE_UPDATE_RESPONSE;
            case 17:
                return STATE_REQUEST;
            case 18:
                return STATE_RESPONSE;
            case 19:
                return INVOKE_SERVICE;
            default:
                return UNKNOWN;
        }
    }
}
