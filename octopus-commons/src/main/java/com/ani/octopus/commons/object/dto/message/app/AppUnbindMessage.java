package com.ani.octopus.commons.object.dto.message.app;

import com.ani.octopus.commons.object.dto.message.ObjectMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by acbson on 16-7-28.
 */
public class AppUnbindMessage extends ObjectMessage {
    public Long appId;
    public Long accountId;

    public AppUnbindMessage(String description, ObjectQueryDto src, Long appId, Long accountId) {
        super(Type.APP_UNBIND, description, src);
        this.appId = appId;
        this.accountId = accountId;
    }
}
