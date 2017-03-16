package com.ani.octopus.commons.object.message.state;

import com.ani.octopus.commons.message.objectState.ObjectStateMessage;
import com.ani.octopus.commons.message.objectState.StateChangeEvents;
import com.ani.octopus.commons.object.dto.stateMachine.StateMachineTransferDto;
import com.ani.octopus.commons.object.enumeration.StateMachineMessageTypes;

/**
 * Created by hey on 17-3-15.
 */
public class StateMachineMessage extends ObjectStateMessage{

    public StateMachineMessageTypes types;

    public StateMachineTransferDto stateMachineTransferDto;

    public StateMachineMessage(Long objectId,StateMachineMessageTypes types,StateMachineTransferDto stateMachineTransferDto) {
        super(objectId, StateChangeEvents.STATE_MACHINE_CHANGED);
        this.types = types;
        this.stateMachineTransferDto = stateMachineTransferDto;
    }
}
