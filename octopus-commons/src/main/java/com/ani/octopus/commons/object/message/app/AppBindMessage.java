package com.ani.octopus.commons.object.message.app;

import com.ani.octopus.commons.object.message.AppMessage;
import com.ani.octopus.commons.object.message.ObjectMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by acbson on 16-7-28.
 */
public class AppBindMessage extends AppMessage {

    public AppBindMessage(String description, ObjectQueryDto src, Long appId, Long accountId) {
        super(ObjectMessage.Type.APP_BIND, description, src , appId, accountId);
    }
}
