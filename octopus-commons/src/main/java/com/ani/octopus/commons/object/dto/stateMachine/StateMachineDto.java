package com.ani.octopus.commons.object.dto.stateMachine;

import java.util.Set;

/**
 * Created by hey on 17-3-16.
 */
public class StateMachineDto {

    public Integer machineId;

    public Set<StateMachineNodeDto> stateMachineNodes;

    public StateMachineNodeDto currentStateNode;

    public StateMachineDto(Integer machineId, Set<StateMachineNodeDto> stateMachineNodes, StateMachineNodeDto currentStateNode) {
        this.machineId = machineId;
        this.stateMachineNodes = stateMachineNodes;
        this.currentStateNode = currentStateNode;
    }
}
