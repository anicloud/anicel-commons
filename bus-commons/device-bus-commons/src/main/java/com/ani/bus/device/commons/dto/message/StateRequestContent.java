package com.ani.bus.device.commons.dto.message;


import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by zsl on 17-3-1.
 */
public class StateRequestContent extends DeviceMessageContent {
    public Integer slaveId;

    public StateRequestContent(Integer slaveId) {
        this.slaveId = slaveId;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(slaveId);
    }

    @Override
    public void read(DataInput in) throws IOException {
        slaveId = in.readInt();
    }
}
