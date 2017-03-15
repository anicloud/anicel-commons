package com.ani.octopus.commons.object.dto.objstub;

import com.ani.octopus.commons.stub.dto.StubInvokeDto;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

import java.util.*;

/**
 * Created by yeh on 15-11-12.
 */
public abstract class ObjectStubDto extends AniDto{

    @AniRequiredField
    public Long objectMainId;

    public ObjectStubDto() {}

    public ObjectStubDto(Long objectMainId) {
        this.objectMainId = objectMainId;
    }

    protected Map<Long, List<Integer>> getStubsMapFromDto(List<StubInvokeDto> stubsDto){
        int expSize = stubsDto.size() / 2;
        Map<Long, List<Integer>> stubsMap = new HashMap<>(stubsDto == null ? 1 : expSize);
        if(stubsDto == null){
            return stubsMap;
        }
        for(StubInvokeDto oneStub: stubsDto){
            if(!stubsMap.containsKey(oneStub.stubGroupId)){
                stubsMap.put(oneStub.stubGroupId, new ArrayList<Integer>(expSize));
            }
            stubsMap.get(oneStub.stubGroupId).add(oneStub.stubId);
        }
        return stubsMap;
    }
}
