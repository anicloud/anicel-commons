package com.ani.octopus.commons.object.dto.object.invocation;

import com.ani.octopus.commons.stub.dto.StubInvokeDto;

import java.util.List;

/**
 * Created by yeh on 15-12-8.
 */
public class ObjectSlaveInvocationDto extends ObjectInvocationDto {

    public Integer objectSlaveId;

    public ObjectSlaveInvocationDto() {}

    public ObjectSlaveInvocationDto(Long objectMainId, List<StubInvokeDto> invokableStubs, Integer objectSlaveId) {
        super(objectMainId, invokableStubs);
        this.objectSlaveId = objectSlaveId;
    }
}
