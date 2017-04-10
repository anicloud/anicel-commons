package com.ani.bus.device.commons.dto.message;

import com.ani.bus.device.commons.dto.statemachine.DeviceStateObjectDto;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by xuben on 17-4-8.
 */
public class StateUpdateRequestContent extends DeviceMessageContent {
    public Integer slaveId;
    public DeviceStateObjectDto deviceStateObjectDto;

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(slaveId);
        deviceStateObjectDto.write(out);
    }

    @Override
    public void read(DataInput in) throws IOException {
        slaveId = in.readInt();
        deviceStateObjectDto.read(in);
    }
}
