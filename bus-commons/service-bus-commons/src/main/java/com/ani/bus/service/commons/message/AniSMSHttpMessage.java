package com.ani.bus.service.commons.message;

import com.ani.bus.service.commons.core.message.HttpMessage;
import com.ani.earth.commons.dto.SMSDto;

/**
 * Created by hey on 16-8-12.
 */
public class AniSMSHttpMessage extends HttpMessage<SMSDto>{

    public AniSMSHttpMessage() {
    }

    public AniSMSHttpMessage(SMSDto returnObj) {
        super(returnObj);
    }

    public AniSMSHttpMessage(ResultCode resultCode, String msg, SMSDto returnObj) {
        super(resultCode, msg, returnObj);
    }
}
