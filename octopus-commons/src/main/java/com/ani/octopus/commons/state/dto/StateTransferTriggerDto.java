package com.ani.octopus.commons.state.dto;

import com.ani.utils.dto.AniDto;

/**
 * Created by yeh on 17-3-17.
 */
public abstract class StateTransferTriggerDto extends AniDto {

    public StateNodeDto nextNode;

    public StateTransferTriggerDto() {
    }

    public StateTransferTriggerDto(StateNodeDto nextNode) {
        this.nextNode = nextNode;
    }
}
