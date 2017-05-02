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
public class DeviceStateMachineNodeDBDto implements ByteSerializable {
    public DeviceStateDBDto state;
    public Collection<DeviceStateTransferStubInvokeTriggerDBDto> deviceStateTransferStubInvokeTriggerDBDtos;

    public DeviceStateMachineNodeDBDto() {

    }

    public DeviceStateMachineNodeDBDto(Long stateGroupId, Integer stateId) {
        this.state = new DeviceStateDBDto(stateGroupId, stateId);
    }

    @Override
    public void write(DataOutput out) throws IOException {
        state.write(out);
        if (deviceStateTransferStubInvokeTriggerDBDtos == null) {
            out.writeInt(0);
        } else {
            out.writeInt(deviceStateTransferStubInvokeTriggerDBDtos.size());
            for (DeviceStateTransferStubInvokeTriggerDBDto deviceStateTransferStubInvokeTriggerDBDto : deviceStateTransferStubInvokeTriggerDBDtos) {
                deviceStateTransferStubInvokeTriggerDBDto.write(out);
            }
        }

    }

    @Override
    public void read(DataInput in) throws IOException {
        state = new DeviceStateDBDto();
        state.read(in);
        int size = in.readInt();
        deviceStateTransferStubInvokeTriggerDBDtos = new ArrayList<>();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                DeviceStateTransferStubInvokeTriggerDBDto deviceStateTransferStubInvokeTriggerDBDto = new DeviceStateTransferStubInvokeTriggerDBDto();
                deviceStateTransferStubInvokeTriggerDBDto.read(in);
                deviceStateTransferStubInvokeTriggerDBDtos.add(deviceStateTransferStubInvokeTriggerDBDto);
            }
        }
    }
}
