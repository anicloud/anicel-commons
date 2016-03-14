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
public class StubDto extends AniDto{

    public Long stubGroupId;

    public Integer stubId;

    public List<StubArgumentDto> inputArguments;

    public List<StubArgumentDto> outputArguments;

    public StubConnType connType;

    public PrivilegeType privilegeType;

    public StubDto() {}

    public StubDto(Long stubGroupId, Integer stubId) {
        this.stubGroupId = stubGroupId;
        this.stubId = stubId;
    }

    public StubDto(Long stubGroupId, Integer stubId, List<StubArgumentDto> inputArguments, List<StubArgumentDto> outputArguments, StubConnType connType, PrivilegeType privilegeType) {
        this.stubGroupId = stubGroupId;
        this.stubId = stubId;
        this.inputArguments = inputArguments;
        this.outputArguments = outputArguments;
        this.connType = connType;
        this.privilegeType = privilegeType;
    }

    //    public StubDto(Stub oneStub){
//        this.stubGroupId = oneStub.group.groupId;
//        this.stubId = oneStub.stubId;
//    }
//
//    public static List<StubDto> batchToDto(List<Stub> stubs){
//        if(AniGeneralUtils.isCollectionEmpty(stubs)) return new ArrayList<>(0);
//        List<StubDto> stubsDto = new ArrayList<>(stubs.size());
//        for(Stub oneStub: stubs){
//            if(oneStub == null) continue;
//            stubsDto.add(new StubDto(oneStub));
//        }
//        return stubsDto;
//    }

    public static List[] getQuery(Collection<StubDto> stubsDto){
        if(stubsDto == null) return new List[]{};
        int expSize = stubsDto.size();
        List groupsId = new ArrayList<>(expSize);
        List stubsId = new ArrayList<>(expSize);
        for(StubDto oneStub: stubsDto){
            if(oneStub == null) continue;
            groupsId.add(oneStub.stubGroupId);
            stubsId.add(oneStub.stubId);
        }
        return new List[]{groupsId, stubsId};
    }

}
