package com.ani.octopus.commons.object.dto.state;

import com.ani.octopus.commons.state.dto.StateMachineDto;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

import java.util.Map;

/**
 * Created by yeh on 15-11-12.
 */
public abstract class ObjectStateDto extends AniDto{

    @AniRequiredField
    public Long objectMainId;

    public Map<Integer, StateMachineDto> stateMachines;

    public ObjectStateDto() {}

    public ObjectStateDto(Long objectMainId) {
        this.objectMainId = objectMainId;
    }

    public ObjectStateDto(Long objectMainId, Map<Integer, StateMachineDto> stateMachines) {
        this.objectMainId = objectMainId;
        this.stateMachines = stateMachines;
    }
}
