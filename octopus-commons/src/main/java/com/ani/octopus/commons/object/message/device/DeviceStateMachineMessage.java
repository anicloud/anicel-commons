package com.ani.octopus.commons.object.message.device;

import com.ani.octopus.commons.dto.object.ObjectQueryDto;
import com.ani.octopus.commons.message.object.Type;
import com.ani.octopus.commons.object.message.DeviceMessage;
import com.ani.octopus.commons.state.dto.StateMachineDto;
import com.ani.octopus.commons.state.dto.StateNodeDto;

import java.util.List;

/**
 * Created by zsl on 17-4-27.
 */
public class DeviceStateMachineMessage extends DeviceMessage {
    public List<StateMachineDto> stateMachineDto;

    public DeviceStateMachineMessage(Type type, String description, ObjectQueryDto src, Long deviceId, List<StateMachineDto> stateMachineDto) {
        super(type, description, src, deviceId);
        this.stateMachineDto = stateMachineDto;
    }
}
