package com.ani.octopus.commons.object.message.device;

import com.ani.octopus.commons.dto.object.ObjectQueryDto;
import com.ani.octopus.commons.message.object.Type;
import com.ani.octopus.commons.object.dto.object.ObjectSlaveInfoDto;
import com.ani.octopus.commons.object.dto.object.ObjectSlaveQueryDto;
import com.ani.octopus.commons.object.message.DeviceMessage;

import java.util.List;

/**
 * Created by hey on 16-11-14.
 */
public class DeviceSearchSlavesMessage extends DeviceMessage {
    public Long accountId;
    public List<ObjectSlaveInfoDto> slavesList;

    public DeviceSearchSlavesMessage(Type type, ObjectQueryDto src, Long deviceId,List<ObjectSlaveInfoDto> slavesList) {
        super(Type.DEVICE_SEARCHSLAVES,"", src, deviceId);
        this.slavesList = slavesList;
    }
}
