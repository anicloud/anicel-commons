package com.ani.bus.device.commons.dto.message;

import com.ani.bus.device.commons.dto.statemachine.DeviceStateDto;
import com.ani.bus.device.commons.dto.statemachine.DeviceStateMachineDto;

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

    public Map<Integer, List<DeviceStateMachineDto>> deviceStateDtos;

    @Override
    public void write(DataOutput out) throws IOException {
        if (deviceStateDtos.size() == 0) {
            out.writeInt(0);
            return;
        }
        out.writeInt(deviceStateDtos.size());
        for (Integer slaveId : deviceStateDtos.keySet()) {
            out.writeInt(slaveId);
            List<DeviceStateMachineDto> deviceStateMachineDtos = deviceStateDtos.get(slaveId);
            if (deviceStateMachineDtos.size() == 0) {
                out.writeInt(0);
                return;
            }
            out.writeInt(deviceStateMachineDtos.size());
            for (DeviceStateMachineDto deviceStateMachineDto : deviceStateMachineDtos) {
                deviceStateMachineDto.write(out);
            }
        }
    }

    @Override
    public void read(DataInput in) throws IOException {
        int size = in.readInt();
        Map<Integer, List<DeviceStateMachineDto>> deviceStateMachines = new HashMap<>();

        for (int i = 0; i < size; i++) {
            Integer slaveId = in.readInt();
            Integer listsize = in.readInt();
            List<DeviceStateMachineDto> deviceStateMachineDtos = new ArrayList<>();
            for (int j = 0; j < listsize; j++) {
                DeviceStateMachineDto deviceStateMachineDto = new DeviceStateMachineDto();
                deviceStateMachineDto.read(in);
                deviceStateMachineDtos.add(deviceStateMachineDto);
            }
            deviceStateMachines.put(slaveId, deviceStateMachineDtos);
        }

    }
}
