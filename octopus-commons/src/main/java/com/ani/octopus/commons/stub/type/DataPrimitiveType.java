package com.ani.octopus.commons.stub.type;

import java.io.Serializable;

/**
 * Created by yeh on 15-12-22.
 */
public class DataPrimitiveType extends DataType implements Serializable {

    public DataPrimitiveTypes type;

    public DataPrimitiveType() {
        super();
    }

    public DataPrimitiveType(DataPrimitiveTypes type) {
        this.type = type;
    }
}
