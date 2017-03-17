package com.ani.octopus.commons.object.dto.stateMachine;

import java.util.Map;

/**
 * Created by hey on 17-3-16.
 */
public class StateObjectDto {

    public String stateObjectId;

    public Map<Integer,StateMachineDto> stateMachineIdMap;

    public Long timetmp;

    public StateMachineDto getStateMachine(Integer machineId){ return stateMachineIdMap.get(machineId);}
}
