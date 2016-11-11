package com.ani.bus.service.commons.message;

import com.ani.bus.service.commons.dto.aniStorage.AniStorageServiceAccessDto;
import com.ani.octopus.commons.message.http.HttpMessage;

/**
 * Created by wyf on 16-8-29.
 */
public class OSSAccessHttpMessage extends HttpMessage<AniStorageServiceAccessDto> {
    public OSSAccessHttpMessage() {
    }

    public OSSAccessHttpMessage(AniStorageServiceAccessDto returnObj) {
        super(returnObj);
    }

    public OSSAccessHttpMessage(ResultCode resultCode, String msg,
                                 AniStorageServiceAccessDto returnObj) {
        super(resultCode, msg, returnObj);
    }
}
