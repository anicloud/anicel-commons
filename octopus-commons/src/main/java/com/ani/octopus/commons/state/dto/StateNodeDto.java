package com.ani.octopus.commons.state.dto;

import com.ani.utils.dto.AniDto;

import java.util.List;

/**
 * Created by yeh on 17-3-17.
 */
public class StateNodeDto extends AniDto {

    public StateDto state;
    public List<StateTransferStubTriggerDto> stateTransferStubTriggerDtos;


    public StateNodeDto() {
    }

    public StateNodeDto(StateDto state) {
        this.state = state;
    }

    public StateNodeDto(StateDto state, List<StateTransferStubTriggerDto> stateTransferStubTriggerDtos) {
        this.state = state;
        this.stateTransferStubTriggerDtos = stateTransferStubTriggerDtos;
    }

    public boolean equals(Object obj) {
        StateNodeDto cmpNode = (StateNodeDto) obj;
        if (!this.state.isLegal() || !cmpNode.state.isLegal()) return false;
        return this.state.equals(cmpNode.state);
    }
}
