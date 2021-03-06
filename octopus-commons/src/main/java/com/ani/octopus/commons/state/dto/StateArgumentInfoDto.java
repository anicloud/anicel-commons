package com.ani.octopus.commons.state.dto;

import com.ani.utils.core.datatype.AniDataType;
import com.ani.utils.dto.AniDto;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by zsl on 17-5-3.
 */
public class StateArgumentInfoDto extends AniDto {
    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS,include = JsonTypeInfo.As.PROPERTY,property = "@class")
    public Object value;
    public AniDataType dataType;
    public String name;

    public StateArgumentInfoDto() {
    }

    public StateArgumentInfoDto(Object value, AniDataType dataType, String name) {
        this.value = value;
        this.dataType = dataType;
        this.name = name;
    }

    public StateArgumentInfoDto(Object value, AniDataType dataType) {
        this.value = value;
        this.dataType = dataType;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public AniDataType getDataType() {
        return dataType;
    }

    public void setDataType(AniDataType dataType) {
        this.dataType = dataType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
