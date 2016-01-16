package com.ani.octopus.commons.object.dto.object;

import com.ani.utils.dto.AniDto;

/**
 * Created by yeh on 15-10-18.
 */
public class ObjectRegDto extends AniDto{

    public String uniId;

    public Long objectId;

    public byte[] token;

    public ObjectRegDto(String uniId, Long objectId, byte[] token) {
        this.uniId = uniId;
        this.objectId = objectId;
        this.token = token;
    }
}
