package com.ani.octopus.commons.stub.type;

import java.io.Serializable;

/**
 * Created by yeh on 15-12-22.
 */
public abstract class DataType<T extends Enum> implements Serializable {

    private static final long serialVersionUID = 2930021334774335010L;

    private T type;

    public T getType() {
        return type;
    }

    public DataType() {
    }

    public DataType(T type) {
        this.type = type;
    }

    public boolean checkType(Class<? extends DataType> targetType){
        if(targetType.isInstance(this)) {
            return true;
        }
        return false;
    }

}
