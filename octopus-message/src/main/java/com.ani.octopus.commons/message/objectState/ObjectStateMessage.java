package com.ani.octopus.commons.message.objectState;

import java.io.Serializable;

/**
 * Created by hey on 17-3-15.
 */
public class ObjectStateMessage implements Serializable{
    public Long objectId;
    public StateChangeEvents event;

    public ObjectStateMessage(Long objectId, StateChangeEvents event) {
        this.objectId = objectId;
        this.event = event;
    }
}
