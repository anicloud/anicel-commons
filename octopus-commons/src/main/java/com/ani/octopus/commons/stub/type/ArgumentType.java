package com.ani.octopus.commons.stub.type;

import java.io.Serializable;

/**
 * Created by hey on 16-12-6.
 */
public class ArgumentType implements Serializable {
    public DataType type;
    public ArgumentType componentType;

    public ArgumentType() {
    }

    public ArgumentType(DataType type) {
        this.type = type;
        this.componentType = null;
    }

    public ArgumentType(DataType type, ArgumentType componentType) {
        this.type = type;
        this.componentType = componentType;
    }

    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public ArgumentType getComponentType() {
        return componentType;
    }

    public void setComponentType(ArgumentType componentType) {
        this.componentType = componentType;
    }
}
