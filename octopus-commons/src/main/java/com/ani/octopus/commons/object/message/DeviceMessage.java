package com.ani.octopus.commons.object.message;

import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by hey on 16-11-10.
 */
public class DeviceMessage extends ObjectMessage{
    public Long deviceId;
    public DeviceMessage(Type type, String description, ObjectQueryDto src,Long deviceId) {
        super(type, description, src);
        this.deviceId = deviceId;
    }
}
