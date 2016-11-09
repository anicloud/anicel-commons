package com.ani.octopus.commons.object.dto.message.app;

import com.ani.octopus.commons.object.dto.message.ObjectMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by acbson on 16-7-28.
 */
public class AppBindMessage extends ObjectMessage {
    public Long appId;
    public Long accountId;

    public AppBindMessage(String description, ObjectQueryDto src, Long appId, Long accountId) {
        super(ObjectMessage.Type.APP_BIND, description, src);
        this.appId = appId;
        this.accountId = accountId;
    }
}
