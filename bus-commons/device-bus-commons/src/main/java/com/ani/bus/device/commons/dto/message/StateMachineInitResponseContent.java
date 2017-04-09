package com.ani.bus.device.commons.dto.message;

import com.ani.bus.device.commons.dto.statemachine.DeviceStateDto;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsl on 17-4-9.
 */
public class StateMachineInitResponseContent extends DeviceMessageContent {
    public Long Objectid;
    public Integer slaveid;
    public List<DeviceStateDto> deviceStateDtos;

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeLong(Objectid);
        out.writeInt(slaveid);
        if (deviceStateDtos == null) {
            out.writeInt(0);
        } else {
            out.writeInt(deviceStateDtos.size());
            for (DeviceStateDto deviceStateDto : deviceStateDtos)
                deviceStateDto.write(out);
        }
    }

    @Override
    public void read(DataInput in) throws IOException {
        Objectid = in.readLong();
        slaveid = in.readInt();
        int size = in.readInt();
        if (size > 0) {
            deviceStateDtos = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                DeviceStateDto deviceStateDto = new DeviceStateDto();
                deviceStateDto.read(in);
                deviceStateDtos.add(deviceStateDto);
            }
        }
    }
}
