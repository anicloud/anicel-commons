package com.ani.octopus.commons.stub.type;

import com.ani.octopus.commons.stub.enumeration.AniDataPrimitiveTypes;
import com.ani.octopus.commons.stub.enumeration.AniDataTypeCategories;
import com.ani.utils.exception.AniRuleException;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;

/**
 * Created by hey on 17-2-15.
 */
public class AniDataType implements Serializable {

    private static final long serialVersionUID = 2930021334774335010L;

    AniDataTypeCategories category;

    AniDataPrimitiveTypes dataType;

    public AniDataType() {
    }

    public AniDataType(AniDataTypeCategories category, AniDataPrimitiveTypes dataType) {
        this.category = category;
        this.dataType = dataType;
    }

    public AniDataTypeCategories getCategory() {
        return category;
    }

    public void setCategory(AniDataTypeCategories category) {
        this.category = category;
    }

    public AniDataPrimitiveTypes getDataType() {
        return dataType;
    }

    public void setDataType(AniDataPrimitiveTypes dataType) {
        this.dataType = dataType;
    }
}
