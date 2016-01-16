package com.ani.octopus.commons.stub.type;

import com.ani.utils.exception.AniRuleException;

/**
 * Created by yeh on 15-10-16.
 */
public enum DataPrimitiveTypes {
    INTEGER(Integer.class),
    PERCENTAGE(Short.class),
    FLOAT(Float.class),
    STRING(String.class),
    BOOLEAN(Boolean.class),
    BINARY(byte[].class),
    OBJECT(Object.class);

    private final Class dataClass;

    DataPrimitiveTypes(Class dataClass) {
        this.dataClass = dataClass;
    }

    public Class getValue(){
        return this.dataClass;
    }

    public static <T extends Object> void checkValueLegality(DataPrimitiveTypes type, T oneValue) throws AniRuleException {
        if(oneValue.getClass() != type.getValue()){
            throw new AniRuleException("DATA_VALUE_NOT_MATCHES_TYPE_" + type.name());
        }
    }
}
