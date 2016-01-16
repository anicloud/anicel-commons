package com.ani.octopus.commons.object.dto.object;

import com.ani.utils.dto.AniRequiredField;

/**
 * Created by yeh on 15-10-16.
 */
public class ObjectSlaveQueryDto extends ObjectQueryDto{

    @AniRequiredField
    public Integer objectSlaveId;

    public ObjectSlaveQueryDto(Long objectId, Integer objectSlaveId) {
        super(objectId);
        this.objectSlaveId = objectSlaveId;
    }
}
