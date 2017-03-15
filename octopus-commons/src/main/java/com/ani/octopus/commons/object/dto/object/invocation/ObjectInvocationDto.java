package com.ani.octopus.commons.object.dto.object.invocation;

import com.ani.octopus.commons.stub.dto.StubInvokeDto;

import java.util.List;

/**
 * Created by yeh on 15-12-8.
 */
public abstract class ObjectInvocationDto {

    public Long objectMainId;

    public List<StubInvokeDto> invokableStubs;

    public ObjectInvocationDto() {
    }

    public ObjectInvocationDto(Long objectMainId, List<StubInvokeDto> invokableStubs) {
        this.objectMainId = objectMainId;
        this.invokableStubs = invokableStubs;
    }
}
