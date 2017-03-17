package com.ani.octopus.commons.state;

import com.ani.octopus.commons.object.enumeration.AniObjectState;
import com.ani.octopus.commons.state.dto.StateMachineDto;
import com.ani.utils.core.AniByte;

import java.util.List;
import java.util.Map;

/**
 * Created by yeh on 17-3-17.
 */
public class ObjectMainState extends ObjectState {

    public Map<AniByte, AniObjectState> hostsConnState;

    public Map<Integer, ObjectSlaveState> slavesState;

    public ObjectMainState(){
        super();
    }

    public ObjectMainState(Map<Integer, StateMachineDto> stateMachines, Map<AniByte, AniObjectState> hostsConnState) {
        super(stateMachines);
        this.hostsConnState = hostsConnState;
    }
}
