package com.ani.octopus.commons.object.dto.object.invocation;

import com.ani.octopus.commons.stub.dto.StubDto;

import java.util.List;

/**
 * Created by yeh on 15-12-8.
 */
public class ObjectMainInvocationDto extends ObjectInvocationDto {

    public ObjectMainInvocationDto() {}

    public ObjectMainInvocationDto(Long objectMainId, List<StubDto> invokableStubs) {
        super(objectMainId, invokableStubs);
    }
}
