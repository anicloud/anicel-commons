package com.ani.octopus.commons.stub.dto;

import com.ani.octopus.commons.stub.type.DataType;
import com.ani.utils.dto.AniDto;

/**
 * Created by yeh on 3/14/16.
 */
public class StubArgumentDto extends AniDto{

    public Object value;

    public StubArgumentDto() {
    }

    public StubArgumentDto(Object value) {
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
        StubArgumentDto that = (StubArgumentDto) o;
        return value != null ? value.equals(that.value) : that.value == null;
    }

    @Override
    public int hashCode() {
        int result = 31 * (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StubArgumentDto{" +
                "value=" + value +
                '}';
    }
}
