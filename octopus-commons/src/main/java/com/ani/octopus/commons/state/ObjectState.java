package com.ani.octopus.commons.state;

import com.ani.octopus.commons.state.dto.StateMachineDto;

import java.util.Map;

/**
 * Created by yeh on 17-3-17.
 */
public abstract class ObjectState {

    public Map<Integer, StateMachineDto> stateMachines;

    public ObjectState() {
    }

    public ObjectState(Map<Integer, StateMachineDto> stateMachines) {
        this.stateMachines = stateMachines;
    }
}
