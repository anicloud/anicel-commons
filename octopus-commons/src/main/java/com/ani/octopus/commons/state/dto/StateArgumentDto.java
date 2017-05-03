package com.ani.octopus.commons.state.dto;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by zsl on 17-5-3.
 */
public class StateArgumentDto {
    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS,include = JsonTypeInfo.As.PROPERTY,property = "@class")
    public Object value;

    public StateArgumentDto() {
    }

    public StateArgumentDto(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StateArgumentDto that = (StateArgumentDto) o;
        return value != null ? value.equals(that.value) : that.value == null;
    }

    @Override
    public int hashCode() {
        int result = 31 * (value != null ? value.hashCode() : 0);
        return result;
    }

}
