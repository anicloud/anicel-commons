package com.ani.octopus.commons.state.dto;

import com.ani.utils.dto.AniDto;

import java.util.List;

/**
 * Created by zsl on 17-5-3.
 */
public class StateMachineTransDto extends AniDto {
    public Long deviceId;
    public Integer slaveId;
    public List<StateTransDto> stateTransDtos;
}
