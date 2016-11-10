package com.ani.octopus.commons.object.message.app;

import com.ani.octopus.commons.object.message.AppMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by acbson on 16-7-28.
 */
public class AppUnbindMessage extends AppMessage {

    public AppUnbindMessage(String description, ObjectQueryDto src, Long appId, Long accountId) {
        super(Type.APP_UNBIND, description, src ,appId ,accountId);
    }
}
