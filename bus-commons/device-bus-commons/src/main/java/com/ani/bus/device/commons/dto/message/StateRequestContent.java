package com.ani.bus.device.commons.dto.message;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by zsl on 17-3-1.
 */
public class StateRequestContent extends DeviceMessageContent {
    public Long objectId;
    public Integer slaveId;
    public Integer numId;

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeLong(objectId);
        out.writeInt(slaveId);
        out.writeInt(numId);
    }

    @Override
    public void read(DataInput in) throws IOException {
        objectId = in.readLong();
        slaveId = in.readInt();
        numId = in.readInt();
    }
}
