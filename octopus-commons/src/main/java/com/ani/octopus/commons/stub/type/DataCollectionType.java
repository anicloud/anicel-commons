package com.ani.octopus.commons.stub.type;

import java.io.Serializable;

/**
 * Created by yeh on 15-12-22.
 */
public class DataCollectionType extends DataType implements Serializable {

    public DataType membersDataType;

    public DataCollectionTypes type;

    public DataCollectionType() {
        super();
    }

    public DataCollectionType(DataType membersDataType, DataCollectionTypes type) {
        super();
        this.membersDataType = membersDataType;
        this.type = type;
    }
}
