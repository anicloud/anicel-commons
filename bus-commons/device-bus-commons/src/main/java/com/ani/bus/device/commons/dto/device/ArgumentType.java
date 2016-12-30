package com.ani.bus.device.commons.dto.device;

/**
 * Created by huangbin on 10/26/15.
 * Modified by xuben on 11/19/16.
 */
public enum ArgumentType {
    NULL(-1),
    BOOLEAN(0),
    CHAR(1),
    BYTE(2),
    SHORT(3),
    INTEGER(4),
    LONG(5),
    FLOAT(6),
    DOUBLE(7),
    STRING(8),
    LIST(9),
    MAP(10),
    SET(11);
    private int value;

    ArgumentType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static ArgumentType getType(int type) {
        switch (type) {
            case -1:
                return NULL;
            case 0:
                return BOOLEAN;
            case 1:
                return CHAR;
            case 2:
                return BYTE;
            case 3:
                return SHORT;
            case 4:
                return INTEGER;
            case 5:
                return LONG;
            case 6:
                return FLOAT;
            case 7:
                return DOUBLE;
            case 8:
                return STRING;
            case 9:
                return LIST;
            case 10:
                return MAP;
            case 11:
                return SET;
            default:
                return NULL;
        }
    }
}
