package com.ani.octopus.commons.object.dto.object;

import com.ani.octopus.commons.object.enumeration.AniObjectState;
import com.ani.octopus.commons.object.enumeration.DataState;
import com.ani.octopus.commons.stub.dto.StubDto;

import java.util.List;

/**
 * Created by yeh on 15-12-1.
 */
public class ObjectSlaveInfoDto extends ObjectInfoDto {

    public AniObjectState state;

    public Integer objectSlaveId;

    public ObjectSlaveInfoDto() {
    }

    public ObjectSlaveInfoDto(List<StubDto> stubs, DataState dataState, AniObjectState state, Integer objectSlaveId) {
        super(stubs, dataState);
        this.state = state;
        this.objectSlaveId = objectSlaveId;
    }

}