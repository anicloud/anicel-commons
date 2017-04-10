package com.ani.bus.device.commons.dto.message;

import com.ani.bus.device.commons.dto.statemachine.DeviceStateObjectDto;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by zsl on 17-3-3.
 */
public class StateResponseContent extends DeviceMessageContent {
    public Integer slaveid;
    public DeviceStateObjectDto deviceStateObjectDto;

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(slaveid);
        deviceStateObjectDto.write(out);
    }

    @Override
    public void read(DataInput in) throws IOException {
        slaveid = in.readInt();
        deviceStateObjectDto.read(in);
    }
}
