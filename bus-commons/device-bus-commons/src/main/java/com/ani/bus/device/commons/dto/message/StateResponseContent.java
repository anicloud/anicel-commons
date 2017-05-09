package com.ani.bus.device.commons.dto.message;

import com.ani.bus.device.commons.dto.statemachine.DeviceStateObjectDBDto;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by zsl on 17-3-3.
 */
public class StateResponseContent extends DeviceMessageContent {
    public Integer slaveid;
    public DeviceStateObjectDBDto deviceStateObjectDBDto;

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(slaveid);
        deviceStateObjectDBDto.write(out);
    }

    @Override
    public void read(DataInput in) {
        try {
            slaveid = in.readInt();
            deviceStateObjectDBDto.read(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
