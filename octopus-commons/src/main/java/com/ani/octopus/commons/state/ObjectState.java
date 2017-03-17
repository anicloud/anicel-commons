package com.ani.octopus.commons.state;

import com.ani.cel.anole.domain.statemachine.StateMachine;
import com.ani.cel.anole.domain.statemachine.StateObject;

/**
 * Created by yeh on 17-3-17.
 */
public abstract class ObjectState {

    public StateObject stateMachines;

    public ObjectState() {
    }

    public ObjectState(StateObject stateMachines) {
        this.stateMachines = stateMachines;
    }
}
