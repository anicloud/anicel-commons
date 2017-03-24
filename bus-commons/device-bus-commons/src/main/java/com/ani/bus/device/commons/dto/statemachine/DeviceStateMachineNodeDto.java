package com.ani.bus.device.commons.dto.statemachine;

import com.ani.bus.device.commons.dto.message.ByteSerializable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by zsl on 17-3-24.
 */
public class DeviceStateMachineNodeDto implements ByteSerializable {
    public DeviceStateDto state;
    public Collection<DeviceStateTransferStubInvokeTriggerDto> deviceStateTransferStubInvokeTriggerDtos;

    @Override
    public void write(DataOutput out) throws IOException {
        state.write(out);
        if (deviceStateTransferStubInvokeTriggerDtos == null) {
            out.writeByte(0);
        } else {
            out.writeByte(deviceStateTransferStubInvokeTriggerDtos.size());
            for (DeviceStateTransferStubInvokeTriggerDto deviceStateTransferStubInvokeTriggerDto : deviceStateTransferStubInvokeTriggerDtos) {
                deviceStateTransferStubInvokeTriggerDto.write(out);
            }
        }

    }

    @Override
    public void read(DataInput in) throws IOException {
        state = new DeviceStateDto();
        state.read(in);
        int size = in.readByte();
        if (size > 0) {
            deviceStateTransferStubInvokeTriggerDtos = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                DeviceStateTransferStubInvokeTriggerDto deviceStateTransferStubInvokeTriggerDto = new DeviceStateTransferStubInvokeTriggerDto();
                deviceStateTransferStubInvokeTriggerDto.read(in);
                deviceStateTransferStubInvokeTriggerDtos.add(deviceStateTransferStubInvokeTriggerDto);
            }
        }
    }
}
