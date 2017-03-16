package com.ani.octopus.commons.object.message.state;

import com.ani.octopus.commons.message.objectState.ObjectStateMessage;
import com.ani.octopus.commons.object.dto.state.ObjectStateDto;
import com.ani.octopus.commons.message.objectState.StateChangeEvents;

/**
 * Created by hey on 17-3-15.
 */
public class ObjectConnStateMessage extends ObjectStateMessage {

    public ObjectStateDto objectStateDto;

    public ObjectConnStateMessage(Long objectId,ObjectStateDto objectStateDto) {
        super(objectId, StateChangeEvents.OBJECT_CONNECCTION_CHANGED);
        this.objectStateDto = objectStateDto;
    }
}
