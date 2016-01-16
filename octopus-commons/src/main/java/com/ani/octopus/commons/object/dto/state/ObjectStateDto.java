package com.ani.octopus.commons.object.dto.state;

import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by yeh on 15-11-12.
 */
public abstract class ObjectStateDto extends AniDto{

    @AniRequiredField
    public Long objectMainId;

    public ObjectStateDto() {}

    public ObjectStateDto(Long objectMainId) {
        this.objectMainId = objectMainId;
    }

//    public static List<Long> getObjectsMainId(List<? extends ObjectStateDto> objectsStateDto) throws AniRuleException {
//        if(AniGeneralUtils.isCollectionEmpty(objectsStateDto)){
//            throw new AniRuleException("OBJECTS_STATE_DTO_ARE_REQUIRED");
//        }
//        List<Long> objsMainId = new ArrayList<Long>(objectsStateDto.size());
//        for(ObjectStateDto oneObjStateDto: objectsStateDto){
//            objsMainId.add(oneObjStateDto.objectMainId);
//        }
//        return objsMainId;
//    }
}
