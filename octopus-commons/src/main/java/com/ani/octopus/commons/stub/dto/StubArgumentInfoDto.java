package com.ani.octopus.commons.stub.dto;

import com.ani.octopus.commons.stub.type.AniDataType;
import com.ani.utils.dto.AniDto;

/**
 * Created by yeh on 3/14/16.
 */
public class StubArgumentInfoDto extends AniDto{

    public AniDataType dataType;

    public String name;

    public StubArgumentInfoDto() {
    }

    public StubArgumentInfoDto(AniDataType dataType, String name) {
        this.dataType = dataType;
        this.name = name;
    }
}
