package com.ani.octopus.commons.object.dto.message.app;

import com.ani.octopus.commons.object.dto.message.ObjectMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by acbson on 16-7-28.
 */
public class AppInstallMessage extends ObjectMessage {
    public Long appId;
    public Long accountId;
    public Long deviceId;

    public AppInstallMessage(String description, ObjectQueryDto src, Long appId, Long accountId, Long deviceId) {
        super(Type.APP_INSTALL, description, src);
        this.appId = appId;
        this.accountId = accountId;
        this.deviceId = deviceId;
    }
}
