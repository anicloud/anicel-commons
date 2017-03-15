package com.ani.octopus.commons.object.dto.objstub;

import com.ani.octopus.commons.stub.dto.StubInvokeDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yeh on 15-11-12.
 */
public class ObjectSlaveStubDto extends ObjectStubDto{

    public Map<Integer, List<StubInvokeDto>> slavesStub;

    public ObjectSlaveStubDto() {
        super();
    }

    public ObjectSlaveStubDto(Long objectMainId, Map<Integer, List<StubInvokeDto>> slavesStub) {
        super(objectMainId);
        this.slavesStub = slavesStub;
    }

    public Map<Integer, Map<Long, List<Integer>>> getSlavesStubsMap(){
        Map<Integer, Map<Long, List<Integer>>> slavesStubsMap
                = new HashMap<Integer, Map<Long, List<Integer>>>(this.slavesStub == null ? 1 : this.slavesStub.size());
        for(Integer oneSlave: slavesStub.keySet()){
            slavesStubsMap.put(
                    oneSlave,
                    getStubsMapFromDto(slavesStub.get(oneSlave))
            );
        }
        return slavesStubsMap;
    }
}
