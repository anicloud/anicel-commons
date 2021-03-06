package com.ani.bus.device.commons.dto.statemachine;

import com.ani.bus.device.commons.dto.message.ByteSerializable;
import com.ani.bus.device.commons.dto.util.MessageUtils;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by zsl on 17-3-24.
 * Modified by xuben on 03/23/18
 */
public class DeviceStateTransferStubInvokeTriggerDBDto implements ByteSerializable {
    public Long stubGroupId;
    public Integer stubId;
    public DeviceStateMachineNodeDBDto nextNode;

    @Override
    public void write(DataOutput out) throws IOException {
//        MessageUtils.writeLong(out, stubGroupId);
        out.writeInt(stubGroupId.intValue());
        out.writeInt(stubId);
        out.writeInt(nextNode.state.stateGroupId.intValue());
//        MessageUtils.writeLong(out, nextNode.state.stateGroupId);
        out.writeInt(nextNode.state.stateId);
    }

    @Override
    public void read(DataInput in) throws IOException {
        stubGroupId = (long) in.readInt();
//        stubGroupId = MessageUtils.readLong(in);
        stubId = in.readInt();
//        nextNode.read(in);
//        Long stateGroupId = MessageUtils.readLong(in);
        Long stateGroupId = (long) in.readInt();
        Integer stateId = in.readInt();
        nextNode = new DeviceStateMachineNodeDBDto(stateGroupId, stateId);
    }
}
