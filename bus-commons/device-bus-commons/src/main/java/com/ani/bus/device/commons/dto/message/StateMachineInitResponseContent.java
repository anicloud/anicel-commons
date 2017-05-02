package com.ani.bus.device.commons.dto.message;

import com.ani.bus.device.commons.dto.statemachine.DeviceStateMachineDBDto;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsl on 17-4-9.
 */
public class StateMachineInitResponseContent extends DeviceMessageContent {
    public Integer slaveid;
    public List<DeviceStateMachineDBDto> deviceStateDtos;

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(slaveid);
        if (deviceStateDtos == null) {
            out.writeInt(0);
        } else {
            out.writeInt(deviceStateDtos.size());
            for (DeviceStateMachineDBDto deviceStateDto : deviceStateDtos)
                deviceStateDto.write(out);
        }
    }

    @Override
    public void read(DataInput in) throws IOException {
        slaveid = in.readInt();
        int size = in.readInt();
        if (size > 0) {
            deviceStateDtos = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                DeviceStateMachineDBDto deviceStateDto = new DeviceStateMachineDBDto();
                deviceStateDto.read(in);
                deviceStateDtos.add(deviceStateDto);
            }
        }
    }
}
