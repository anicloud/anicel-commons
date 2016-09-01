package com.ani.octopus.commons.stub.dto;

import com.ani.utils.dto.AniDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yeh on 15-10-16.
 */
public class StubGroupInfoDto extends AniDto{

    public Long groupId;

    public String name;

    public StubGroupInfoDto() {
    }

    public StubGroupInfoDto(Long groupId, String name) {
        this.groupId = groupId;
        this.name = name;
    }

    public StubGroupInfoDto(Long groupId) {
        this.groupId = groupId;
    }
}
