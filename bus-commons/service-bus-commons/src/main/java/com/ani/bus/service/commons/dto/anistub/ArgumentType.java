package com.ani.bus.service.commons.dto.anistub;


import java.io.Serializable;

/**
 * Created by zhaoyu on 15-10-29.
 */
public class ArgumentType implements Serializable {
    public AniDataType type;
    public ArgumentType componentType;

    public ArgumentType() {
    }

    public ArgumentType(AniDataType type) {
        this.type = type;
        this.componentType = null;
    }

    public ArgumentType(AniDataType type, ArgumentType componentType) {
        this.type = type;
        this.componentType = componentType;
    }

    public AniDataType getType() {
        return type;
    }

    public void setType(AniDataType type) {
        this.type = type;
    }

    public ArgumentType getComponentType() {
        return componentType;
    }

    public void setComponentType(ArgumentType componentType) {
        this.componentType = componentType;
    }
}
