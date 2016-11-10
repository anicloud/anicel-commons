package com.ani.octopus.commons.object.message.app;

import com.ani.octopus.commons.object.message.AppMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by acbson on 16-7-28.
 */
public class AppUninstallMessage extends AppMessage {
    public Long deviceId;

    public AppUninstallMessage(String description, ObjectQueryDto src, Long appId, Long accountId, Long deviceId) {
        super(Type.APP_UNINSTALL, description, src ,appId ,accountId);
        this.deviceId = deviceId;
    }
}
