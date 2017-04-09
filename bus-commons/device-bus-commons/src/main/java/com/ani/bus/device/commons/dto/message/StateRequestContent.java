package com.ani.bus.device.commons.dto.message;

import com.ani.bus.device.commons.dto.util.MessageUtils;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by zsl on 17-3-1.
 */
public class StateRequestContent extends DeviceMessageContent {
    public Long objectId;
    public Integer slaveId;

    public StateRequestContent(Long objectId, Integer slaveId) {
        this.objectId = objectId;
        this.slaveId = slaveId;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        MessageUtils.writeLong(out, objectId);
        out.writeInt(slaveId);
    }

    @Override
    public void read(DataInput in) throws IOException {
        objectId = MessageUtils.readLong(in);
        slaveId = in.readInt();
    }
}
