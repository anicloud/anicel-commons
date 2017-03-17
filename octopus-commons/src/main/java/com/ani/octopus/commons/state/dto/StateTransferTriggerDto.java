package com.ani.octopus.commons.state.dto;

/**
 * Created by yeh on 17-3-17.
 */
public abstract class StateTransferTriggerDto {

    StateNodeDto nextNode;

    public StateTransferTriggerDto() {
    }

    public StateTransferTriggerDto(StateNodeDto nextNode) {
        this.nextNode = nextNode;
    }
}
