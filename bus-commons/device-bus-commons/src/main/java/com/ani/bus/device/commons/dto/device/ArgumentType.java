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
    CHARARRAY(8),
    BYTEARRAY(9),
    SHORTARRAY(10),
    INTEGERARRAY(11),
    LONGARRAY(12),
    FLOATARRAY(13),
    DOUBLEARRAY(14);

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
                return CHARARRAY;
            case 9:
                return BYTEARRAY;
            case 10:
                return SHORTARRAY;
            case 11:
                return INTEGERARRAY;
            case 12:
                return LONGARRAY;
            case 13:
                return FLOATARRAY;
            case 14:
                return DOUBLEARRAY;
            default:
                return NULL;
        }
    }
}
