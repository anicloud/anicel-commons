package com.ani.bus.device.commons.dto.message;

import com.ani.bus.device.commons.dto.statemachine.DeviceStateMachineDBDto;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zsl on 17-4-9.
 */
public class StateMachinesInitResponseContent extends DeviceMessageContent {

    public Map<Integer, List<DeviceStateMachineDBDto>> deviceStateDtos = new HashMap<>();

    @Override
    public void write(DataOutput out) {
        try {
            if (deviceStateDtos.size() == 0) {
                out.writeInt(0);
                return;
            }
            out.writeInt(deviceStateDtos.size());
            for (Integer slaveId : deviceStateDtos.keySet()) {
                out.writeInt(slaveId);
                List<DeviceStateMachineDBDto> deviceStateMachineDBDtos = deviceStateDtos.get(slaveId);
                if (deviceStateMachineDBDtos.size() == 0) {
                    out.writeInt(0);
                    return;
                }
                out.writeInt(deviceStateMachineDBDtos.size());
                for (DeviceStateMachineDBDto deviceStateMachineDBDto : deviceStateMachineDBDtos) {
                    deviceStateMachineDBDto.write(out);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read(DataInput in) {
        try {
            int size = in.readInt();
            for (int i = 0; i < size; i++) {
                Integer slaveId = in.readInt();
                Integer listsize = in.readInt();
                List<DeviceStateMachineDBDto> deviceStateMachineDBDtos = new ArrayList<>();
                for (int j = 0; j < listsize; j++) {
                    DeviceStateMachineDBDto deviceStateMachineDBDto = new DeviceStateMachineDBDto();
                    deviceStateMachineDBDto.read(in);
                    deviceStateMachineDBDtos.add(deviceStateMachineDBDto);
                }
                deviceStateDtos.put(slaveId, deviceStateMachineDBDtos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
