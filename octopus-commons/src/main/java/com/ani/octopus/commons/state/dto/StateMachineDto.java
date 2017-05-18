package com.ani.octopus.commons.state.dto;

import com.ani.utils.dto.AniDto;

import java.util.List;

/**
 * Created by yeh on 17-3-17.
 * transfer between devicebus and octopus
 */
public class StateMachineDto extends AniDto {

    public Integer smId;

    public List<StateNodeDto> stateNodes;

    public StateDto curState;

    public StateMachineDto() {
    }

    public StateMachineDto(Integer smId, List<StateNodeDto> stateNodes) {
        this.smId = smId;
        this.stateNodes = stateNodes;
    }

    public StateMachineDto(Integer smId, StateDto curState) {
        this.smId = smId;
        this.curState = curState;
    }
}
