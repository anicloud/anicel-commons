package com.ani.octopus.commons.object.dto.state;

import com.ani.octopus.commons.object.enumeration.AniObjectState;
import com.ani.octopus.commons.state.dto.StateMachineDto;
import com.ani.utils.dto.AniRequiredField;

import java.util.Map;

/**
 * Created by yeh on 15-11-12.
 */
public class ObjectSlaveStateDto extends ObjectStateDto {

    @AniRequiredField
//    public Map<Integer, AniObjectState> slavesState;
    public AniObjectState slaveState;
    public Integer slaveId;

    public ObjectSlaveStateDto() {
    }

//    public ObjectSlaveStateDto(Long objectMainId, Map<Integer, AniObjectState> slavesState) {
//        super(objectMainId);
//        this.slavesState = slavesState;
//    }

    public ObjectSlaveStateDto(Long objectMainId, AniObjectState slaveState) {
        super(objectMainId);
        this.slaveState = slaveState;
    }

    public ObjectSlaveStateDto(Long objectMainId, Map<Integer, StateMachineDto> stateMachines, AniObjectState slaveState, Integer slaveId) {
        super(objectMainId, stateMachines);
        this.slaveState = slaveState;
        this.slaveId = slaveId;
    }
}
