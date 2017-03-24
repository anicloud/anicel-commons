package com.ani.octopus.commons.state.dto;

import java.util.Set;

/**
 * Created by yeh on 17-3-17.
 */
public class StateMachineDto {

    public Integer smId;

    public Set<StateNodeDto> stateNodes;

    public StateNodeDto curState;

    public StateMachineDto() {}

    public StateMachineDto(Integer smId, Set<StateNodeDto> stateNodes, StateNodeDto curState) {
        this.smId = smId;
        this.stateNodes = stateNodes;
        this.curState = curState;
    }
}
