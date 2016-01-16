package com.ani.octopus.commons.object.dto.state;

import com.ani.octopus.commons.object.enumeration.AniObjectState;
import com.ani.utils.core.AniByte;
import com.ani.utils.dto.AniRequiredField;

import java.util.Map;

/**
 * Created by yeh on 15-11-12.
 */
public class ObjectMainStateDto extends ObjectStateDto {

    @AniRequiredField
    public Map<AniByte, AniObjectState> hosts;

    public ObjectMainStateDto() {
    }

    public ObjectMainStateDto(Long objectMainId, Map<AniByte, AniObjectState> hosts) {
        super(objectMainId);
        this.hosts = hosts;
    }
}
