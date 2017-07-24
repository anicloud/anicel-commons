package com.ani.bus.service.commons.message;

import com.ani.bus.service.commons.dto.aniservice.AniSerAccountObjDto;
import com.ani.bus.service.commons.dto.aniservice.AniServiceObjInfoDto;
import com.ani.octopus.commons.message.http.HttpMessage;

import java.util.List;

/**
 * Created by zhanglina on 17-7-10.
 */
public class ServiceObjHttpMessage extends HttpMessage<List<AniServiceObjInfoDto>> {
    public ServiceObjHttpMessage(){}
    public ServiceObjHttpMessage(List<AniServiceObjInfoDto> aniServiceObjInfoDtos){
        super(aniServiceObjInfoDtos);
    }
    public ServiceObjHttpMessage(ResultCode resultCode, String msg, List<AniServiceObjInfoDto> returnObj){
        super(resultCode,msg,returnObj);
    }

}
