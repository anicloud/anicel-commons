package com.ani.octopus.commons.stub.type;

import com.ani.utils.exception.AniRuleException;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by yeh on 15-10-16.
 */
public enum DataCollectionTypes{
    LIST(List.class),
    MAP(Map.class),
    SET(Set.class);

    private final Class dataClass;

    DataCollectionTypes(Class dataClass) {
        this.dataClass = dataClass;
    }

    public Class getValue(){
        return this.dataClass;
    }

    public static <T extends Object> void checkValueLegality(DataCollectionTypes type, T oneValue) throws AniRuleException {
        if(oneValue.getClass() != type.getValue()){
            throw new AniRuleException("DATA_COLLECTION_NOT_MATCHES_TYPE_" + type.name());
        }
    }
}
