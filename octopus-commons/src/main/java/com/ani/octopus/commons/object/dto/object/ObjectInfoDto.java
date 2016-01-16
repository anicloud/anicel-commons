package com.ani.octopus.commons.object.dto.object;

import com.ani.octopus.commons.object.enumeration.DataState;
import com.ani.octopus.commons.stub.dto.StubDto;
import com.ani.utils.dto.AniDto;

import java.util.List;

/**
 * Created by yeh on 15-10-18.
 */
public abstract class ObjectInfoDto extends AniDto{

    public List<StubDto> stubs;

    public DataState dataState;

    public ObjectInfoDto() {
    }

    public ObjectInfoDto(List<StubDto> stubs, DataState dataState) {
        this.stubs = stubs;
        this.dataState = dataState;
    }
}
