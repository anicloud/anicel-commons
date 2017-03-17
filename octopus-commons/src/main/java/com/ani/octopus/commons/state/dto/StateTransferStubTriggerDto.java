package com.ani.octopus.commons.state.dto;

import com.ani.octopus.commons.stub.dto.StubDto;

/**
 * Created by yeh on 17-3-17.
 */
public class StateTransferStubTriggerDto extends StateTransferTriggerDto {

    StubDto stub;

    public StateTransferStubTriggerDto() {
        super();
    }

    public StateTransferStubTriggerDto(StateNodeDto nextNode, StubDto stub) {
        super(nextNode);
        this.stub = stub;
    }
}
