package com.ani.octopus.commons.stub.dto;

import com.ani.octopus.commons.stub.enumeration.PrivilegeType;
import com.ani.octopus.commons.stub.enumeration.StubConnType;
import com.ani.utils.dto.AniDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by yeh on 15-10-16.
 */
public class StubInfoDto extends AniDto{

    public Integer stubId;

    public String name;

    public StubGroupInfoDto group;

    public List<StubArgumentInfoDto> inputArguments;

    public List<StubArgumentInfoDto> outputArguments;

    public StubConnType connType;

    public PrivilegeType privilegeType;

    public StubInfoDto() {}

    public StubInfoDto(Integer stubId, String name, StubGroupInfoDto group, List<StubArgumentInfoDto> inputArguments, List<StubArgumentInfoDto> outputArguments, StubConnType connType, PrivilegeType privilegeType) {
        this.stubId = stubId;
        this.name = name;
        this.group = group;
        this.inputArguments = inputArguments;
        this.outputArguments = outputArguments;
        this.connType = connType;
        this.privilegeType = privilegeType;
    }
}
