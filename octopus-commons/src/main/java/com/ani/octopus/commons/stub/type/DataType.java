package com.ani.octopus.commons.stub.type;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;

/**
 * Created by yeh on 15-12-22.
 */
@JsonTypeInfo(use= JsonTypeInfo.Id.CLASS,include= JsonTypeInfo.As.PROPERTY,property="@class")
@JsonSubTypes({@JsonSubTypes.Type(value=DataPrimitiveType.class),@JsonSubTypes.Type(value=DataCollectionType.class)})
public abstract class DataType<T extends Enum> implements Serializable {

    private static final long serialVersionUID = 2930021334774335010L;

    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
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
