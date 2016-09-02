package com.ani.bus.service.commons.message;

import com.ani.bus.service.commons.core.message.HttpMessage;
import com.ani.bus.service.commons.dto.aniStorage.AniStorageServiceAccessDto;

/**
 * Created by wyf on 16-8-29.
 */
public class OSSAccessHttpMessage extends HttpMessage<AniStorageServiceAccessDto>{
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
