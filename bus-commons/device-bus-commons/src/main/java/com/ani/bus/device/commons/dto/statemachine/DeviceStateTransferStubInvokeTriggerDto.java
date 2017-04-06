package com.ani.bus.device.commons.dto.statemachine;

import com.ani.bus.device.commons.dto.message.ByteSerializable;
import com.ani.bus.device.commons.dto.util.MessageUtils;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by zsl on 17-3-24.
 */
public class DeviceStateTransferStubInvokeTriggerDto implements ByteSerializable {
    public Long stubGroupId;
    public Integer stubId;
    public DeviceStateMachineNodeDto nextNode;

    @Override
    public void write(DataOutput out) throws IOException {
        MessageUtils.writeLong(out, stubGroupId);
        out.writeInt(stubId);
        MessageUtils.writeLong(out, nextNode.state.stateGroupId);
        out.writeInt(nextNode.state.stateId);
    }

    @Override
    public void read(DataInput in) throws IOException {
        stubGroupId = MessageUtils.readLong(in);
        stubId = in.readInt();
//        nextNode.read(in);
        Long stateGroupId = MessageUtils.readLong(in);
        Integer stateId = in.readInt();
        nextNode = new DeviceStateMachineNodeDto(stateGroupId, stateId);
    }
}
