package com.ani.bus.device.commons.dto.device;

import com.ani.bus.device.commons.dto.message.ByteSerializable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by huangbin on 12/18/15.
 */
public class FunctionDto implements ByteSerializable {
    public Integer functionId;
    public Long groupId;

    public FunctionDto(Integer functionId, Long groupId) {
        this.functionId = functionId;
        this.groupId = groupId;
    }

    public FunctionDto() {

    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeLong(groupId);
        out.writeInt(functionId);
    }

    @Override
    public void read(DataInput in) throws IOException {
        groupId = in.readLong();
        functionId = in.readInt();
    }
}
