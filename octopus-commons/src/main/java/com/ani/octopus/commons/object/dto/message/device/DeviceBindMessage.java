package com.ani.octopus.commons.object.dto.message.device;

import com.ani.octopus.commons.object.dto.message.ObjectMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by huangbin on 1/20/16.
 */
public class DeviceBindMessage extends ObjectMessage {
    public Long deviceId;
    public Long accountId;

    public DeviceBindMessage(String description, ObjectQueryDto src, Long deviceId, Long accountId) {
        super(Type.DEVICE_BOUND, description, src);
        this.deviceId = deviceId;
        this.accountId = accountId;
    }
}
