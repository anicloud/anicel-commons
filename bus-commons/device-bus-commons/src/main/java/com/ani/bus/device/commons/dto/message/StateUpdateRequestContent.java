package com.ani.bus.device.commons.dto.message;

import com.ani.bus.device.commons.dto.statemachine.DeviceStateObjectDBDto;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by xuben on 17-4-8.
 */
public class StateUpdateRequestContent extends DeviceMessageContent {
    public Integer slaveId;
    public DeviceStateObjectDBDto deviceStateObjectDBDto;

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(slaveId);
        deviceStateObjectDBDto.write(out);
    }

    @Override
    public void read(DataInput in) throws IOException {
        slaveId = in.readInt();
        deviceStateObjectDBDto.read(in);
    }
}
