package com.ani.octopus.commons.state.dto;

import com.ani.utils.dto.AniDto;

import java.util.List;

/**
 * Created by zsl on 17-5-3.
 */
public class StateInfoDto  extends AniDto {
    public Long stateGroupid;
    public Integer stateId;
    public String description;
    public List<StateArgumentInfoDto> stateArgumentInfoDtoList;
}
