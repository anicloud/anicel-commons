package com.ani.bus.service.commons.dto.anistub;


/**
 * Created by zhaoyu on 15-10-29.
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
