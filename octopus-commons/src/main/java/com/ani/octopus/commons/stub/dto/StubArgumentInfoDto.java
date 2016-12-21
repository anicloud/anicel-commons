package com.ani.octopus.commons.stub.dto;

import com.ani.octopus.commons.stub.type.DataType;
import com.ani.utils.dto.AniDto;

/**
 * Created by yeh on 3/14/16.
 */
public class StubArgumentInfoDto<T extends DataType> extends AniDto{

    public T dataType;

    public String name;

    public StubArgumentInfoDto() {
    }

    public StubArgumentInfoDto(T dataType, String name) {
        this.dataType = dataType;
        this.name = name;
    }
}
