package com.ani.octopus.commons.object.message.device;

import com.ani.octopus.commons.object.message.DeviceMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by huangbin on 1/20/16.
 */
public class DeviceUnshareMessage extends DeviceMessage {
    public Long groupId;

    public DeviceUnshareMessage(String description, ObjectQueryDto src, Long deviceId, Long groupId) {
        super(Type.DEVICE_UNSHARED, description, src , deviceId);
        this.groupId = groupId;
    }
}
