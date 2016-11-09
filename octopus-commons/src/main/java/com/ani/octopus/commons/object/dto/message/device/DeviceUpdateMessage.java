package com.ani.octopus.commons.object.dto.message.device;

import com.ani.octopus.commons.object.dto.message.ObjectMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by huangbin on 1/20/16.
 */
public class DeviceUpdateMessage extends ObjectMessage {
    public Long deviceId;

    public DeviceUpdateMessage(ObjectQueryDto src, Long deviceId) {
        super(Type.DEVICE_UPDATED, "", src);
        this.deviceId = deviceId;
    }
}
