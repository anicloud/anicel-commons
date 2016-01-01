package com.anicel.commons.service.bus.message;

import com.anicel.commons.message.HttpMessage;
import com.anicel.commons.service.bus.dto.aniservice.AniServiceDto;

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
