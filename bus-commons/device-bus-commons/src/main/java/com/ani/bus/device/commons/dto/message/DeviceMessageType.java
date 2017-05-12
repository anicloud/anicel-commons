package com.ani.bus.device.commons.dto.message;

/**
 * Created by huangbin on 15/10/27
 * Modified by xuben on 17/04/08
 */
public enum DeviceMessageType {
    HEART_BEAT_REQUEST(1),
    HEART_BEAT_RESPONSE(2),
    TIME_SYNC_REQUEST(3),
    TIME_SYNC_RESPONSE(4),

    REGISTER_REQUEST(5),
    REGISTER_RESPONSE(6),
    AUTH_REQUEST(7),
    AUTH_RESPONSE(8),
    UPDATE_REQUEST(9),
    UPDATE_RESPONSE(10),
    INVOKE_REQUEST(11),
    INVOKE_RESPONSE(12),
    STATE_OBJECT_REQUEST(13),
    STATE_OBJECT_RESPONSE(14),
    STATES_OBJECT_REQUEST(15),
    STATES_OBJECT_RESPONSE(16),
    STATE_UPDATE_REQUEST(17),
    STATE_UPDATE_RESPONSE(18),
    STATE_REQUEST(18),
    STATE_RESPONSE(19),
    INVOKE_SERVICE(20),
    UNKNOWN(21);

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
