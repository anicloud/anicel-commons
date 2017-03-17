package com.ani.octopus.commons.object.dto.state;

import java.util.Map;

/**
 * Created by hey on 17-3-17.
 */
public abstract class ObjectState {

    public Long objectMainId;

    public Map<Integer, StateMachine> stateMachines;

    public ObjectState() {
    }

    public ObjectState(Long objectMainId, Map<Integer, StateMachine> stateMachines) {
        this.objectMainId = objectMainId;
        this.stateMachines = stateMachines;
    }
}
