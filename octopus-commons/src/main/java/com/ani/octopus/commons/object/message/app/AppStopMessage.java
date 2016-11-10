package com.ani.octopus.commons.object.message.app;

import com.ani.octopus.commons.object.message.AppMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by acbson on 16-7-28.
 */
public class AppStopMessage extends AppMessage {
    public Long deviceId;

    public AppStopMessage(String description, ObjectQueryDto src, Long appId, Long accountId, Long deviceId) {
        super(Type.APP_STOP, description, src,appId,accountId);
        this.deviceId = deviceId;
    }
}
