package com.ani.octopus.commons.object.dto.message.device;

import com.ani.octopus.commons.object.dto.message.ObjectMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by huangbin on 1/20/16.
 */
public class DeviceUnshareMessage extends ObjectMessage {
    public Long deviceId;
    public Long groupId;

    public DeviceUnshareMessage(String description, ObjectQueryDto src, Long deviceId, Long groupId) {
        super(Type.DEVICE_UNSHARED, description, src);
        this.deviceId = deviceId;
        this.groupId = groupId;
    }
}
