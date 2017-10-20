package com.ani.bus.device.commons.dto.device;

/**
 * Created by xuben on 10/19/17.
 * Modified by xuben on 10/20/17.
 */
public class ArgumentObject {
    public ArgumentType type;
    public Object value;

    public ArgumentObject() {
        type = ArgumentType.NULL;
        value = null;
    }

    public ArgumentObject(ArgumentType type, Object value) {
        this.type = type;
        this.value = value;
    }

}
