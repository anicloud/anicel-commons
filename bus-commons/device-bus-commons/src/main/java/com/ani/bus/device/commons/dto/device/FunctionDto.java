package com.ani.bus.device.commons.dto.device;

import com.ani.bus.device.commons.dto.message.ByteSerializable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by huangbin on 12/18/15.
 */
public class FunctionDto implements ByteSerializable {
    private Integer functionId;
    private Long groupId;

    public FunctionDto(Integer functionId, Long groupId) {
        this.functionId = functionId;
        this.groupId = groupId;
    }

    public FunctionDto() {

    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(functionId);
        out.writeLong(groupId);
    }

    @Override
    public void read(DataInput in) throws IOException {
        functionId = in.readInt();
        groupId = in.readLong();
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }
}
