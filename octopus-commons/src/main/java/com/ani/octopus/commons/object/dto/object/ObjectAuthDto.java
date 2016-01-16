package com.ani.octopus.commons.object.dto.object;

import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

/**
 * Created by yeh on 15-10-18.
 */
public class ObjectAuthDto extends AniDto{

    @AniRequiredField
    public Long objectId;

    @AniRequiredField
    public Long timestamp;

    @AniRequiredField
    public byte[] requestCode;

    public byte[] hostIp;

    public ObjectAuthDto(Long objectId, Long timestamp, byte[] requestCode, byte[] hostIp) {
        this.objectId = objectId;
        this.timestamp = timestamp;
        this.requestCode = requestCode;
        this.hostIp = hostIp;
    }
}
