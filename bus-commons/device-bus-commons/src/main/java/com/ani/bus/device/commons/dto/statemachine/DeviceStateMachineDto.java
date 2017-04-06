package com.ani.bus.device.commons.dto.statemachine;

import com.ani.bus.device.commons.dto.message.ByteSerializable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zsl on 17-3-24.
 */
public class DeviceStateMachineDto implements ByteSerializable {
    public Integer smId;
    public DeviceStateDto currentDeviceStateMachineDto;
    public Set<DeviceStateMachineNodeDto> deviceStateMachineNodeDtos;

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(smId);
        currentDeviceStateMachineDto.write(out);
        if (deviceStateMachineNodeDtos == null) {
            out.writeInt(0);
        } else {
            out.writeInt(deviceStateMachineNodeDtos.size());
            for (DeviceStateMachineNodeDto deviceStateMachineNodeDto : deviceStateMachineNodeDtos) {
                deviceStateMachineNodeDto.write(out);
            }
        }
    }

    @Override
    public void read(DataInput in) throws IOException {
        smId = in.readInt();
        currentDeviceStateMachineDto.read(in);
        int size = in.readInt();
        if (size > 0) {
            deviceStateMachineNodeDtos = new HashSet<>();
            for (int i = 0; i < size; i++) {
                DeviceStateMachineNodeDto deviceStateMachineNodeDto = new DeviceStateMachineNodeDto();
                deviceStateMachineNodeDto.read(in);
                deviceStateMachineNodeDtos.add(deviceStateMachineNodeDto);
            }
        }
    }
}
