package com.ani.bus.device.commons.dto.message;

import com.ani.bus.device.commons.dto.device.DeviceSlaveDto;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by zsl on 17-6-13.
 */
public class UpdateSingleRequestContent extends DeviceMessageContent {
    public DeviceSlaveDto deviceSlaveDto;
    public boolean isRemoved;

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeBoolean(isRemoved);
        deviceSlaveDto.write(out);
    }

    @Override
    public void read(DataInput in) throws IOException {
        if (!(isRemoved = in.readBoolean())) {
            deviceSlaveDto = new DeviceSlaveDto();
            deviceSlaveDto.read(in);
        }
    }
}
