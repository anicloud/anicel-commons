package com.ani.octopus.commons.object.dto.objstub;

import com.ani.octopus.commons.stub.dto.StubInvokeDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by yeh on 15-11-12.
 */
public class ObjectMainStubDto extends ObjectStubDto{

    public List<StubInvokeDto> stubs;

    public ObjectMainStubDto() {
        super();
    }

    public ObjectMainStubDto(Long objectMainId, List<StubInvokeDto> stubs) {
        super(objectMainId);
        this.stubs = stubs;
    }

    public ObjectMainStubDto(Long objectMainId) {
        super(objectMainId);
    }

    public static ObjectMainStubDto getFromMap(Long objectMainId, Map<Long, List<Integer>> groupsStubMap){
        if(groupsStubMap == null || groupsStubMap.size() < 1) return new ObjectMainStubDto(objectMainId);
        ObjectMainStubDto oneObjMainStubDto = new ObjectMainStubDto(objectMainId, new ArrayList<StubInvokeDto>(groupsStubMap.size() * 3));
        for(Long oneStubGroupId: groupsStubMap.keySet()){
            List<Integer> groupStubsId = groupsStubMap.get(oneStubGroupId);
            if(groupStubsId == null || groupStubsId.size() < 1) continue;
            List<StubInvokeDto> curGroupStubsDto = new ArrayList<>(groupStubsId.size());
            for(Integer oneGroupStubId: groupStubsId){
                oneObjMainStubDto.stubs.add(new StubInvokeDto(oneStubGroupId, oneGroupStubId));
            }
        }
        return oneObjMainStubDto;
    }

    public Map<Long, List<Integer>> getStubsMap(){
        return getStubsMapFromDto(this.stubs);
    }

}
