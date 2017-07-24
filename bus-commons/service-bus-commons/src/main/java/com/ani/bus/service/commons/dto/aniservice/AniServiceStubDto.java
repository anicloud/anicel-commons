package com.ani.bus.service.commons.dto.aniservice;

import java.io.Serializable;

/**
 * Created by zhanglina on 17-7-4.
 */
public class AniServiceStubDto implements Serializable {

    private static final long serialVersionUID = -1117389797395265869L;
    public Integer stubId;
    public Long groupId;

    public AniServiceStubDto(Integer stubId, Long groupId) {
        this.stubId = stubId;
        this.groupId = groupId;
    }

    public AniServiceStubDto() {

    }

    @Override
    public boolean equals(Object obj) {
        AniServiceStubDto tar=(AniServiceStubDto)obj;
        if (this.groupId.equals(tar.groupId) &&
                this.stubId.equals(tar.stubId)){
            return true;
        }
        return false;
    }
}
