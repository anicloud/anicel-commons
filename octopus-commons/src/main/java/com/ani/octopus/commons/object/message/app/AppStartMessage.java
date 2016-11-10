package com.ani.octopus.commons.object.message.app;

import com.ani.octopus.commons.object.message.AppMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by acbson on 16-7-28.
 */
public class AppStartMessage extends AppMessage {
    public Long deviceId;

    public AppStartMessage(String description, ObjectQueryDto src, Long appId, Long accountId, Long deviceId) {
        super(Type.APP_START, description, src ,appId,accountId);
        this.deviceId = deviceId;
    }
}
