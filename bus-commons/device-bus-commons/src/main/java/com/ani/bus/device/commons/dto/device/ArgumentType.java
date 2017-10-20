package com.ani.bus.device.commons.dto.device;

/**
 * Created by huangbin on 10/26/15.
 * Modified by xuben on 10/20/17.
 */
public enum ArgumentType {
    UNKNOWN(-1),
    NULL(0),
    BOOLEAN(1),
    CHAR(2),
    BYTE(3),
    SHORT(4),
    INTEGER(5),
    LONG(6),
    FLOAT(7),
    DOUBLE(8),
    STRING(9),
    ARRAY(10),
    COLLECTION(11);

    private int value;

    ArgumentType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static ArgumentType getType(int type) {
        switch (type) {
            case 0:
                return NULL;
            case 1:
                return BOOLEAN;
            case 2:
                return CHAR;
            case 3:
                return BYTE;
            case 4:
                return SHORT;
            case 5:
                return INTEGER;
            case 6:
                return LONG;
            case 7:
                return FLOAT;
            case 8:
                return DOUBLE;
            case 9:
                return STRING;
            case 10:
                return ARRAY;
            case 11:
                return COLLECTION;
            default:
                return UNKNOWN;
        }
    }

    public static int getTypeValue(Object obj) {
        if (obj instanceof Boolean)
            return BOOLEAN.getValue();
        if (obj instanceof Character)
            return CHAR.getValue();
        if (obj instanceof Byte)
            return BYTE.getValue();
        if (obj instanceof Short)
            return SHORT.getValue();
        if (obj instanceof Integer)
            return INTEGER.getValue();
        if (obj instanceof Long)
            return LONG.getValue();
        if (obj instanceof Float)
            return FLOAT.getValue();
        if (obj instanceof Double)
            return DOUBLE.getValue();
        return UNKNOWN.getValue();
    }
}
