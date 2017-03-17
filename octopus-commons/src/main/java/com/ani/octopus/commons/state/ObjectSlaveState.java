package com.ani.octopus.commons.state;

import com.ani.octopus.commons.object.enumeration.AniObjectState;
import com.ani.octopus.commons.state.dto.StateMachineDto;
import com.ani.utils.core.AniByte;

import java.util.Map;

/**
 * Created by yeh on 17-3-17.
 */
public class ObjectSlaveState extends ObjectState {

    public AniObjectState connState;

    public ObjectSlaveState(){
        super();
    }

    public ObjectSlaveState(Map<Integer, StateMachineDto> stateMachines, AniObjectState connState) {
        super(stateMachines);
        this.connState = connState;
    }
}
