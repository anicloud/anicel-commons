package com.ani.octopus.commons.object.message.device;

import com.ani.octopus.commons.object.message.DeviceMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by huangbin on 1/20/16.
 */
public class DeviceBindMessage extends DeviceMessage {
    public Long accountId;

    public DeviceBindMessage(String description, ObjectQueryDto src, Long deviceId, Long accountId) {
        super(Type.DEVICE_BOUND, description, src, deviceId);
        this.accountId = accountId;
    }
}
