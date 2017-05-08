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
public class DeviceStateMachineDBDto implements ByteSerializable {
    public Integer smId;
    public DeviceStateDBDto currentDeviceStateMachineDto;
    public Set<DeviceStateMachineNodeDBDto> deviceStateMachineNodeDBDtos;

    @Override
    public void write(DataOutput out) {
        try {
            out.writeInt(smId);
            currentDeviceStateMachineDto.write(out);
            if (deviceStateMachineNodeDBDtos == null) {
                out.writeInt(0);
            } else {
                out.writeInt(deviceStateMachineNodeDBDtos.size());
                for (DeviceStateMachineNodeDBDto deviceStateMachineNodeDBDto : deviceStateMachineNodeDBDtos) {
                    deviceStateMachineNodeDBDto.write(out);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read(DataInput in) {
        try {
            smId = in.readInt();
            currentDeviceStateMachineDto.read(in);
            int size = in.readInt();
            if (size > 0) {
                deviceStateMachineNodeDBDtos = new HashSet<>(size);
                for (int i = 0; i < size; i++) {
                    DeviceStateMachineNodeDBDto deviceStateMachineNodeDBDto = new DeviceStateMachineNodeDBDto();
                    deviceStateMachineNodeDBDto.read(in);
                    deviceStateMachineNodeDBDtos.add(deviceStateMachineNodeDBDto);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
