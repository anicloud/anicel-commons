package com.ani.bus.device.commons.dto.message;

/**
 * Created by huangbin on 10/27/15
 * Modified by xuben on 06/15/17
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
    UPDATE_MASTER_REQUEST(11),
    UPDATE_MASTER_RESPONSE(12),
    UPDATE_SLAVE_REQUEST(13),
    UPDATE_SLAVE_RESPONSE(14),
    STATEDTO_REQUEST(15),
    STATEDTO_RESPONSE(16),
    STATE_REQUEST(17),
    STATE_RESPONSE(18),
    ON_STATES_OBJECT_REQUEST(19),
    ON_STATES_OBJECT_RESPONSE(20),
    INVOKE_REQUEST(21),
    INVOKE_RESPONSE(22),
    INVOKE_SERVICE(23),
    STATE_OBJECT_REQUEST(24),
    STATE_OBJECT_RESPONSE(25),
    STATES_OBJECT_REQUEST(26),
    STATES_OBJECT_RESPONSE(27),
    UNKNOWN(28);

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
                return UPDATE_MASTER_REQUEST;
            case 12:
                return UPDATE_MASTER_RESPONSE;
            case 13:
                return UPDATE_SLAVE_REQUEST;
            case 14:
                return UPDATE_SLAVE_RESPONSE;
            case 15:
                return STATEDTO_REQUEST;
            case 16:
                return STATEDTO_RESPONSE;
            case 17:
                return STATE_REQUEST;
            case 18:
                return STATE_RESPONSE;
            case 19:
                return ON_STATES_OBJECT_REQUEST;
            case 20:
                return ON_STATES_OBJECT_RESPONSE;
            case 21:
                return INVOKE_REQUEST;
            case 22:
                return INVOKE_RESPONSE;
            case 23:
                return INVOKE_SERVICE;
            case 24:
                return STATE_OBJECT_REQUEST;
            case 25:
                return STATE_OBJECT_RESPONSE;
            case 26:
                return STATES_OBJECT_REQUEST;
            case 27:
                return STATES_OBJECT_RESPONSE;
            default:
                return UNKNOWN;
        }
    }
}
