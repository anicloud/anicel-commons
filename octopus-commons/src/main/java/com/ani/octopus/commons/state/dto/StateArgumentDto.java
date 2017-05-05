package com.ani.octopus.commons.state.dto;

import com.ani.utils.dto.AniDto;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by zsl on 17-5-5.
 */
public class StateArgumentDto extends AniDto {
    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
    public Object value;

    public StateArgumentDto() {
    }

    public StateArgumentDto(Object value) {
        this.value = value;
    }

}
