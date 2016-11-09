package com.ani.octopus.commons.object.dto.message.app;

import com.ani.octopus.commons.object.dto.message.ObjectMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by acbson on 16-7-28.
 */
public class AppStartMessage extends ObjectMessage {
    public Long appId;
    public Long accountId;
    public Long deviceId;

    public AppStartMessage(String description, ObjectQueryDto src, Long appId, Long accountId, Long deviceId) {
        super(Type.APP_START, description, src);
        this.appId = appId;
        this.accountId = accountId;
        this.deviceId = deviceId;
    }
}
