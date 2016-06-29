package com.ani.bus.device.commons.dto.device;

/**
 * Created by huangbin on 10/26/15.
 */
public class ArgumentType {
    public Type type;
    public ArgumentType componentType;

    public enum Type {
        BOOLEAN,
        BYTE,
        CHAR,
        SHORT,
        INTEGER,
        LONG,
        FLOAT,
        DOUBLE,
        STRING,
        ARRAY
    }

    public ArgumentType(Type type) {
        this.type = type;
        this.componentType = null;
    }

    public ArgumentType(Type type, ArgumentType componentType) {
        this.type = type;
        this.componentType = componentType;
    }

    public boolean isArray() {
        return (type == Type.ARRAY);
    }

}
