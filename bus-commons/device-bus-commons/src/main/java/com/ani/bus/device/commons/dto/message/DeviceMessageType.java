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
    STATE_REQUEST(19),
    STATE_RESPONSE(20),
    ON_STATES_OBJECT_REQUEST(21),
    ON_STATES_OBJECT_RESPONSE(22),
    UPDATE_MASTER_REQUEST(23),
    UPDATE_MASTER_RESPONSE(24),
    UPDATE_SLAVE_REQUEST(25),
    UPDATE_SLAVE_RESPONSE(26),
    STATEDTO_REQUEST(27),
    STATEDTO_RESPONSE(28),
    INVOKE_SERVICE(29),
    UNKNOWN(30);

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
                return HEART_BEAT_REQUEST;
            case 2:
                return HEART_BEAT_RESPONSE;
            case 3:
                return TIME_SYNC_REQUEST;
            case 4:
                return TIME_SYNC_RESPONSE;
            case 5:
                return REGISTER_REQUEST;
            case 6:
                return REGISTER_RESPONSE;
            case 7:
                return AUTH_REQUEST;
            case 8:
                return AUTH_RESPONSE;
            case 9:
                return UPDATE_REQUEST;
            case 10:
                return UPDATE_RESPONSE;
            case 11:
                return INVOKE_REQUEST;
            case 12:
                return INVOKE_RESPONSE;
            case 13:
                return STATE_OBJECT_REQUEST;
            case 14:
                return STATE_OBJECT_RESPONSE;
            case 15:
                return STATES_OBJECT_REQUEST;
            case 16:
                return STATES_OBJECT_RESPONSE;
            case 17:
                return STATE_UPDATE_REQUEST;
            case 18:
                return STATE_UPDATE_RESPONSE;
            case 19:
                return STATE_REQUEST;
            case 20:
                return STATE_RESPONSE;
            case 21:
                return ON_STATES_OBJECT_REQUEST;
            case 22:
                return ON_STATES_OBJECT_RESPONSE;
            case 23:
                return UPDATE_MASTER_REQUEST;
            case 24:
                return UPDATE_MASTER_RESPONSE;
            case 25:
                return UPDATE_SLAVE_REQUEST;
            case 26:
                return UPDATE_SLAVE_RESPONSE;
            case 27:
                return STATEDTO_REQUEST;
            case 28:
                return STATEDTO_RESPONSE;
            case 29:
                return INVOKE_SERVICE;
            default:
                return UNKNOWN;
        }
    }
}
