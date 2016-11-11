package com.ani.octopus.commons.dto.object;

import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by yeh on 15-10-16.
 */
public abstract class ObjectQueryDto extends AniDto{

    @AniRequiredField
    public Long objectId;

    public ObjectQueryDto(Long objectId) {
        this.objectId = objectId;
    }
}
