package com.ani.octopus.commons.state.dto;

import com.ani.utils.dto.AniDto;

import java.util.List;

/**
 * Created by zsl on 17-5-3.
 */
public class StateTransDto extends AniDto {
    public Long stateGroupid;
    public Integer stateId;
    public String description;
    public List<StateArgumentInfoDto> stateArgumentInfoDtoList;

    public StateTransDto(Long stateGroupid, Integer stateId, List<StateArgumentInfoDto> stateArgumentInfoDtoList) {
        this.stateGroupid = stateGroupid;
        this.stateId = stateId;
        this.stateArgumentInfoDtoList = stateArgumentInfoDtoList;
    }
}
