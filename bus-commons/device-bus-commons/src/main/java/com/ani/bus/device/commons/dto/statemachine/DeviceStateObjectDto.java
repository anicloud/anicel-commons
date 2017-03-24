package com.ani.bus.device.commons.dto.statemachine;

import com.ani.bus.device.commons.dto.message.ByteSerializable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsl on 17-3-15.
 * transfer between devicebus and deviceagent
 */
public class DeviceStateObjectDto implements ByteSerializable {
    public Integer smId;
    public List<DeviceStateMachineDto> deviceStateMachineDtos;
    public Long timestamp;

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(smId);
        if (deviceStateMachineDtos == null) {
            out.writeByte(0);
        } else {
            out.writeByte(deviceStateMachineDtos.size());
            for (DeviceStateMachineDto deviceStateObjectDto : deviceStateMachineDtos) {
                deviceStateObjectDto.write(out);
            }
        }
    }

    @Override
    public void read(DataInput in) throws IOException {
        smId = in.readInt();
        int size = in.readByte();
        if (size > 0) {
            deviceStateMachineDtos = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                DeviceStateMachineDto deviceStateMachineDto = new DeviceStateMachineDto();
                deviceStateMachineDto.read(in);
                deviceStateMachineDtos.add(deviceStateMachineDto);
            }
        }
        timestamp = System.currentTimeMillis();
    }
}
