package com.ani.octopus.commons.object.message.state;

import com.ani.octopus.commons.message.objectState.ObjectStateMessage;
import com.ani.octopus.commons.message.objectState.StateChangeEvents;
import com.ani.octopus.commons.state.dto.StateDto;

import java.util.List;

/**
 * Created by zsl on 17-4-13.
 */
public class ObjectStateUpdateMessage extends ObjectStateMessage {
    Integer slaveId;
    List<StateDto> stateDto;

    public ObjectStateUpdateMessage(Long objectId, StateChangeEvents event) {
        super(objectId, event);
    }

    public ObjectStateUpdateMessage(Long objectId, Integer slaveId, StateChangeEvents event) {
        super(objectId, event);
        this.slaveId = slaveId;
    }

    public ObjectStateUpdateMessage(Long objectId, Integer slaveId, StateChangeEvents event, List<StateDto> stateDto) {
        super(objectId, event);
        this.slaveId = slaveId;
        this.stateDto = stateDto;
    }
}
