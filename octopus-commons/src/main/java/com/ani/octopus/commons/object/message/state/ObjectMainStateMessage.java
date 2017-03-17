package com.ani.octopus.commons.object.message.state;

import com.ani.octopus.commons.message.objectState.ObjectStateMessage;
import com.ani.octopus.commons.message.objectState.StateChangeEvents;
import com.ani.octopus.commons.object.enumeration.StateMachineMessageTypes;
import com.ani.octopus.commons.state.ObjectMainState;

/**
 * Created by hey on 17-3-15.
 */
public class ObjectMainStateMessage extends ObjectStateMessage{

    public StateMachineMessageTypes types;

    public ObjectMainState objectMainState;

    public ObjectMainStateMessage(Long objectId, StateMachineMessageTypes types, ObjectMainState objectMainState) {
        super(objectId, StateChangeEvents.STATE_MACHINE_CHANGED);
        this.types = types;
        this.objectMainState = objectMainState;
    }
}
