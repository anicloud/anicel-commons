package com.ani.octopus.commons.object.message.device;

import com.ani.octopus.commons.message.object.Type;
import com.ani.octopus.commons.object.message.DeviceMessage;
import com.ani.octopus.commons.dto.object.ObjectQueryDto;

/**
 * Created by huangbin on 1/20/16.
 */
public class DeviceUnbindMessage extends DeviceMessage {
    public Long accountId;

    public DeviceUnbindMessage(String description, ObjectQueryDto src, Long deviceId, Long accountId) {
        super(Type.DEVICE_UNBOUND, description, src, deviceId);
        this.accountId = accountId;
    }
}
