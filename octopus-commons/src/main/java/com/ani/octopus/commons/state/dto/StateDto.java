package com.ani.octopus.commons.state.dto;

import com.ani.utils.dto.AniDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yeh on 17-3-17.
 */
public class StateDto extends AniDto {

    public Long groupId;

    public Integer stateId;

    public StateDto() {
    }

    public StateDto(Long groupId, Integer stateId) {
        this.groupId = groupId;
        this.stateId = stateId;
    }

    public static List<Long> getStateGroupQuery(List<StateDto> stateDtos) {
        List<Long> statesGroup = new ArrayList<>(stateDtos.size());
        for(StateDto oneState: stateDtos){
            statesGroup.add(oneState.groupId);
        }
        return statesGroup;
    }


    @Override
    public int hashCode() {
        return this.groupId.intValue() + this.stateId;
    }

    @Override
    public boolean equals(Object obj) {
        StateDto cmpState = (StateDto) obj;
        if (!this.isLegal()) return false;
        return (this.groupId == cmpState.groupId)
                && (this.stateId == cmpState.stateId);
    }

    public boolean isLegal() {
        if (
                this.stateId == null
                        || this.groupId == null)
            return false;
        else
            return true;
    }
}
