package com.ani.octopus.commons.state;

import com.ani.cel.anole.domain.statemachine.StateObject;
import com.ani.octopus.commons.object.enumeration.AniObjectState;
import com.ani.utils.core.AniByte;

import java.util.Map;

/**
 * Created by yeh on 17-3-17.
 */
public class ObjectMainState extends ObjectState {

    public Map<AniByte, AniObjectState> hostsConnState;


    public ObjectMainState(){
        super();
    }

    public ObjectMainState(StateObject stateMachines, Map<AniByte, AniObjectState> hostsConnState) {
        super(stateMachines);
        this.hostsConnState = hostsConnState;
    }
}
