package com.ani.octopus.commons.stub.dto;

import com.ani.octopus.commons.stub.type.DataType;
import com.ani.utils.dto.AniDto;

/**
 * Created by yeh on 3/14/16.
 */
public class StubArgumentDto extends AniDto{

    public DataType dataType;

    public String name;

    public StubArgumentDto() {
    }

    public StubArgumentDto(DataType dataType, String name) {
        this.dataType = dataType;
        this.name = name;
    }
}
