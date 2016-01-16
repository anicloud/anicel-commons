package com.ani.octopus.commons.object.dto.state;

import com.ani.octopus.commons.object.enumeration.AniObjectState;
import com.ani.utils.dto.AniRequiredField;

import java.util.Map;

/**
 * Created by yeh on 15-11-12.
 */
public class ObjectSlaveStateDto extends ObjectStateDto {

    @AniRequiredField
    public Map<Integer, AniObjectState> slavesState;

    public ObjectSlaveStateDto() {
    }

//    public AniObjectMainStatePo toPo() {
//        AniObjectMainStatePo objectMainStatePo = new AniObjectMainStatePo(this.objectMainId);
//        objectMainStatePo.slavesState = slavesState;
//        return objectMainStatePo;
//    }

    public ObjectSlaveStateDto(Long objectMainId, Map<Integer, AniObjectState> slavesState) {
        super(objectMainId);
        this.slavesState = slavesState;
    }
}
