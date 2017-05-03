package com.ani.octopus.commons.object.message.device;

import com.ani.octopus.commons.dto.object.ObjectQueryDto;
import com.ani.octopus.commons.message.object.Type;
import com.ani.octopus.commons.message.objectState.StateChangeEvents;
import com.ani.octopus.commons.object.message.DeviceMessage;
import com.ani.octopus.commons.state.dto.StateDto;
import com.ani.octopus.commons.state.dto.StateMachineTransDto;

import java.util.List;

/**
 * Created by zsl on 17-4-13.
 */
public class DeviceStateUpdateMessage extends DeviceMessage {
    public Integer slaveId;
    public List<StateDto> stateDtoList;//todo 消息通知时传入object状态
    public StateChangeEvents stateChangeEvents;
    public StateMachineTransDto stateMachineTransDto;

    public DeviceStateUpdateMessage(ObjectQueryDto objectQueryDto, StateChangeEvents stateChangeEvents, List<StateDto> stateDtos) {
        super(Type.DEVICE_UPDATE_STATE, "", objectQueryDto, objectQueryDto.objectId);
        this.stateChangeEvents = stateChangeEvents;
        this.stateDtoList = stateDtos;
    }

    public DeviceStateUpdateMessage(Long deviceId, Integer slaveId, StateChangeEvents stateChangeEvents, List<StateDto> stateDtos) {
        super(Type.DEVICE_UPDATE_STATE, "", null, deviceId);
        this.slaveId = slaveId;
        this.stateChangeEvents = stateChangeEvents;
        this.stateDtoList = stateDtos;
    }

    public void setStateMachineTransDto(StateMachineTransDto stateMachineTransDto) {
        this.stateMachineTransDto = stateMachineTransDto;
    }
}
