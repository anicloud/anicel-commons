package com.ani.bus.service.commons.message;

import com.ani.bus.service.commons.dto.aniservice.AniServiceDto;
import com.ani.octopus.commons.message.http.HttpMessage;

/**
 * Created by zhaoyu on 15-12-9.
 */
public class AniServiceHttpMessage extends HttpMessage<AniServiceDto> {
    public AniServiceHttpMessage() {
    }

    public AniServiceHttpMessage(AniServiceDto returnObj) {
        super(returnObj);
    }

    public AniServiceHttpMessage(ResultCode resultCode, String msg,
                                 AniServiceDto returnObj) {
        super(resultCode, msg, returnObj);
    }
}
