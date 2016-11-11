package com.ani.octopus.commons.object.message.device;

import com.ani.octopus.commons.message.object.Type;
import com.ani.octopus.commons.object.message.DeviceMessage;
import com.ani.octopus.commons.dto.object.ObjectQueryDto;

/**
 * Created by huangbin on 1/20/16.
 */
public class DeviceDisconnectMessage extends DeviceMessage {

    public DeviceDisconnectMessage(ObjectQueryDto src, Long deviceId) {
        super(Type.DEVICE_DISCONNECTED, "", src,deviceId);
    }
}
