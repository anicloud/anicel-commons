package com.ani.bus.device.commons.dto.statemachine;

import com.ani.bus.device.commons.dto.message.ByteSerializable;
import com.ani.bus.device.commons.dto.util.MessageUtils;

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
//    public Integer slaveId;
    public List<DeviceStateDto> deviceStateMachineDtos;
    public Long timestamp;

    public final Object lock = new Object();
    @Override
    public void write(DataOutput out) throws IOException {
//        out.writeInt(slaveId);
        if (deviceStateMachineDtos == null) {
            out.writeInt(0);
        } else {
            out.writeInt(deviceStateMachineDtos.size());
            for (DeviceStateDto deviceStateObjectDto : deviceStateMachineDtos) {
                deviceStateObjectDto.write(out);
            }
        }
    }

    @Override
    public void read(DataInput in) throws IOException {
//        slaveId = in.readInt();
        int size = in.readInt();
        if (size > 0) {
            deviceStateMachineDtos = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                DeviceStateDto deviceStateMachineDto = new DeviceStateDto();
                deviceStateMachineDto.read(in);
                deviceStateMachineDtos.add(deviceStateMachineDto);
            }
        }
        timestamp = System.currentTimeMillis();
    }
}
