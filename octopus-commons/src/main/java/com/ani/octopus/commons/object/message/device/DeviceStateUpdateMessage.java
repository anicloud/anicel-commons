package com.ani.octopus.commons.object.message.device;

import com.ani.octopus.commons.dto.object.ObjectQueryDto;
import com.ani.octopus.commons.message.object.Type;
import com.ani.octopus.commons.message.objectState.StateChangeEvents;
import com.ani.octopus.commons.object.dto.object.ObjectSlaveQueryDto;
import com.ani.octopus.commons.object.message.DeviceMessage;
import com.ani.octopus.commons.state.dto.StateDto;

import java.util.List;

/**
 * Created by zsl on 17-4-13.
 */
public class DeviceStateUpdateMessage extends DeviceMessage {
    public Integer slaveId;
    public List<StateDto> stateDtoList;
    public StateChangeEvents stateChangeEvents;

    public DeviceStateUpdateMessage(ObjectQueryDto objectQueryDto, StateChangeEvents stateChangeEvents, List<StateDto> stateDtos) {
        super(Type.DEVICE_UPDATE_STATE, "", objectQueryDto, objectQueryDto.objectId);
        this.stateChangeEvents = stateChangeEvents;
        this.stateDtoList = stateDtos;
    }

    public DeviceStateUpdateMessage(Long deviceId, Integer slaveId, StateChangeEvents stateChangeEvents, List<StateDto> stateDtos) {
        super(Type.DEVICE_UPDATE_STATE, "StateUpdate", new ObjectSlaveQueryDto(deviceId,slaveId), deviceId);
        this.slaveId = slaveId;
        this.stateChangeEvents = stateChangeEvents;
        this.stateDtoList = stateDtos;
    }
}
