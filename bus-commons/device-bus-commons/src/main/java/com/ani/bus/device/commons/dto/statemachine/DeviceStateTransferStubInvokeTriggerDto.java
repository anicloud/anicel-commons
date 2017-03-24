package com.ani.bus.device.commons.dto.statemachine;

import com.ani.bus.device.commons.dto.message.ByteSerializable;

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

    }

    @Override
    public void read(DataInput in) throws IOException {

    }
}
