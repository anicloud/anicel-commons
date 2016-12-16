package com.ani.octopus.commons.stub.dto;

import com.ani.octopus.commons.stub.type.DataType;
import com.ani.utils.dto.AniDto;

/**
 * Created by yeh on 3/14/16.
 */
public class StubArgumentDto extends AniDto{

    public DataType dataType;

    public String name;

    public Object value;

    public StubArgumentDto() {
    }

    public StubArgumentDto(DataType dataType, String name, Object value) {
        this.dataType = dataType;
        this.name = name;
        this.value = value;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

        if (dataType != null ? !dataType.equals(that.dataType) : that.dataType != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return value != null ? value.equals(that.value) : that.value == null;

    }

    @Override
    public int hashCode() {
        int result = dataType != null ? dataType.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StubArgumentDto{" +
                "dataType=" + dataType +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
