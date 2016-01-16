package com.ani.octopus.commons.stub.dto;

import com.ani.utils.dto.AniDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yeh on 15-10-16.
 */
public class StubGroupDto extends AniDto{

    public Long stubGroupId;

    public StubGroupDto(Long stubGroupId) {
        this.stubGroupId = stubGroupId;
    }

    public static List<Long> getStubGroupQuery(List<StubGroupDto> groupsDto) {
        List<Long> stubsGroup = new ArrayList<>(groupsDto.size());
        for(StubGroupDto oneGroup: groupsDto){
            stubsGroup.add(oneGroup.stubGroupId);
        }
        return stubsGroup;
    }
}
