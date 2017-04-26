package com.ani.octopus.commons.object.message.device;

import com.ani.octopus.commons.dto.object.ObjectQueryDto;
import com.ani.octopus.commons.message.object.Type;
import com.ani.octopus.commons.message.objectState.StateChangeEvents;
import com.ani.octopus.commons.object.message.DeviceMessage;
import com.ani.octopus.commons.state.dto.StateDto;

import java.util.List;

/**
 * Created by zsl on 17-4-13.
 */
public class DeviceStateUpdateMessage extends DeviceMessage {
    Integer slaveId;
    List<StateDto> stateDtoList;//todo 消息通知时传入object状态
    StateChangeEvents stateChangeEvents;

    public DeviceStateUpdateMessage(ObjectQueryDto objectQueryDto, StateChangeEvents stateChangeEvents) {
        super(Type.DEVICE_UPDATED, "", objectQueryDto, objectQueryDto.objectId);
        this.stateChangeEvents = stateChangeEvents;
    }
    public DeviceStateUpdateMessage(Long deviceId, Integer slaveId, StateChangeEvents stateChangeEvents,List<StateDto> stateDtos) {
        super(Type.DEVICE_UPDATED, "", null, deviceId);
        this.slaveId = slaveId;
        this.stateChangeEvents = stateChangeEvents;
        this.stateDtoList = stateDtos;
    }
}
