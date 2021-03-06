package com.ani.bus.service.commons.dto.aniservice;
import com.ani.octopus.commons.object.enumeration.AniObjectState;
import com.ani.octopus.commons.stub.dto.StubInfoDto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhanglina on 17-7-11.
 */
public class AniServiceObjInfoDto implements Serializable{
    private static final long serialVersionUID = 8902865790470571573L;
    public Long objectId;
    public Long accountId;
    public String uniId;
    public List<StubInfoDto> stubInfoDtos;
    public AniObjectState aniObjectState;
    public AniServiceObjInfoDto(){}

    public AniServiceObjInfoDto(Long objectId, Long accountId, String uniId, List<StubInfoDto> stubInfoDtos,AniObjectState aniObjectState) {
        this.objectId = objectId;
        this.accountId = accountId;
        this.uniId = uniId;
        this.stubInfoDtos = stubInfoDtos;
        this.aniObjectState=aniObjectState;
    }
}
