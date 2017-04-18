package com.ani.bus.device.commons.dto.message;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by zsl on 17-4-9.
 */
public class StateMachineInitRequestContent extends DeviceMessageContent {
    public Integer slaveid;

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(slaveid);
    }

    @Override
    public void read(DataInput in) throws IOException {
        slaveid = in.readInt();
    }
}
