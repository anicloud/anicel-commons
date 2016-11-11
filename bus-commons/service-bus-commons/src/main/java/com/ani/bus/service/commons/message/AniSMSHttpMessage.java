package com.ani.bus.service.commons.message;

import com.ani.earth.commons.dto.SMSDto;
import com.ani.octopus.commons.message.http.HttpMessage;
import com.ani.octopus.commons.message.http.Message;

/**
 * Created by hey on 16-8-12.
 */
public class AniSMSHttpMessage extends HttpMessage<SMSDto> {

    public AniSMSHttpMessage() {
    }

    public AniSMSHttpMessage(SMSDto returnObj) {
        super(returnObj);
    }

    public AniSMSHttpMessage(Message.ResultCode resultCode, String msg, SMSDto returnObj) {
        super(resultCode, msg, returnObj);
    }
}
