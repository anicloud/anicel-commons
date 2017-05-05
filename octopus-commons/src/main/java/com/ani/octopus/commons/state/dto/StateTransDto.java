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

    public StateTransDto() {
    }

    public StateTransDto(Long stateGroupid, Integer stateId) {
        this.stateGroupid = stateGroupid;
        this.stateId = stateId;
    }

    public StateTransDto(Long stateGroupid, Integer stateId, List<StateArgumentInfoDto> stateArgumentInfoDtoList) {
        this.stateGroupid = stateGroupid;
        this.stateId = stateId;
        this.stateArgumentInfoDtoList = stateArgumentInfoDtoList;
    }

    public StateTransDto(Long stateGroupid, Integer stateId, String description, List<StateArgumentInfoDto> stateArgumentInfoDtoList) {
        this.stateGroupid = stateGroupid;
        this.stateId = stateId;
        this.description = description;
        this.stateArgumentInfoDtoList = stateArgumentInfoDtoList;
    }

    public Long getStateGroupid() {
        return stateGroupid;
    }

    public void setStateGroupid(Long stateGroupid) {
        this.stateGroupid = stateGroupid;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<StateArgumentInfoDto> getStateArgumentInfoDtoList() {
        return stateArgumentInfoDtoList;
    }

    public void setStateArgumentInfoDtoList(List<StateArgumentInfoDto> stateArgumentInfoDtoList) {
        this.stateArgumentInfoDtoList = stateArgumentInfoDtoList;
    }
}
