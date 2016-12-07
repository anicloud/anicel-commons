package com.ani.octopus.commons.stub.domain;

import com.ani.octopus.commons.stub.dto.StubGroupInfoDto;
import com.ani.utils.core.AniGeneralUtils;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Map;

/**
 * Created by yeh on 15-10-16.
 */
@Component
public class StubGroup implements Serializable {
    private static final long serialVersionUID = 3279913717029887609L;

    public Long groupId;

    public String name;

    public StubGroup() {
    }

    public StubGroup(Long groupId, String name) {
        this.groupId = groupId;
        this.name = name;
    }

    public StubGroup(Long groupId) {
        this.groupId = groupId;
    }

    public static StubGroup fromInfoDto(StubGroupInfoDto stubGroupInfoDto) {
        if(stubGroupInfoDto == null) return null;
        return new StubGroup(
                stubGroupInfoDto.groupId,
                stubGroupInfoDto.name
        );
    }

    public static List<StubGroup> batchFromInfoDto(List<StubGroupInfoDto> groupsInfo){
        if (AniGeneralUtils.isCollectionEmpty(groupsInfo)) return new ArrayList<>(0);
        List<StubGroup> groups = new ArrayList<>(groupsInfo.size());
        for (StubGroupInfoDto oneGroup: groupsInfo) {
            if (oneGroup == null) continue;
            groups.add(fromInfoDto(oneGroup));
        }
        return groups;
    }

    public StubGroupInfoDto toInfoDto() {
        return new StubGroupInfoDto(this.groupId, this.name);
    }

    public static List<StubGroupInfoDto> batchToInfoDto(List<StubGroup> stubsGroup) {
        if (AniGeneralUtils.isCollectionEmpty(stubsGroup)) return new ArrayList<>(0);
        List<StubGroupInfoDto> stubsGroupInfoDto = new ArrayList<>(stubsGroup.size());
        for (StubGroup oneStubGroup: stubsGroup) {
            if (oneStubGroup == null) continue;
            stubsGroupInfoDto.add(oneStubGroup.toInfoDto());
        }
        return stubsGroupInfoDto;
    }

//    public static StubGroup fromPo(StubGroupPo stubGroupPo) {
//        return new StubGroup(
//                stubGroupPo.groupId,
//                stubGroupPo.name
//        );
//    }
//
//    public static List<StubGroup> fromPo(List<StubGroupPo> stubsGroupPo) {
//        List<StubGroup> stubsGroup = new ArrayList<>(stubsGroupPo.size());
//        for (StubGroupPo oneGroupPo : stubsGroupPo) {
//            stubsGroup.add(fromPo(oneGroupPo));
//        }
//        return stubsGroup;
//    }

    public static Map<Long, StubGroup> getGroupMapFromList(List<StubGroup> stubsGroup) {
        if(AniGeneralUtils.isCollectionEmpty(stubsGroup)) return new HashMap<>(0);
        Map<Long, StubGroup> groupsMap = new HashMap<>(stubsGroup.size());
        for(StubGroup oneGroup: stubsGroup) {
            groupsMap.put(oneGroup.groupId, oneGroup);
        }
        return groupsMap;
    }
    public boolean equals(Object obj) {
        StubGroup stubGroup = (StubGroup)obj;
        return (this.hashCode() == stubGroup.hashCode());
    }

    public int hashCode() {
        return Objects.hashCode(groupId);
    }
}
