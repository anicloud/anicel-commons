package com.ani.octopus.commons.object.dto.object.invocation;

import com.ani.octopus.commons.stub.dto.StubDto;

import java.util.List;

/**
 * Created by yeh on 15-12-8.
 */
public class ObjectSlaveInvocationDto extends ObjectInvocationDto {

    public Integer objectSlaveId;

    public ObjectSlaveInvocationDto() {}

    public ObjectSlaveInvocationDto(Long objectMainId, List<StubDto> invokableStubs, Integer objectSlaveId) {
        super(objectMainId, invokableStubs);
        this.objectSlaveId = objectSlaveId;
    }
}
