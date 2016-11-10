package com.ani.octopus.commons.object.message.device;

import com.ani.octopus.commons.object.message.DeviceMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by huangbin on 1/20/16.
 */
public class DeviceUpdateMessage extends DeviceMessage {

    public DeviceUpdateMessage(ObjectQueryDto src, Long deviceId) {
        super(Type.DEVICE_UPDATED, "", src,deviceId);
    }
}
