package com.ani.bus.service.commons.message.callmessage;

import com.ani.bus.service.commons.dto.anidevice.DeviceStateDto;
import com.ani.bus.service.commons.message.MessageType;
import com.ani.bus.service.commons.message.SocketMessage;
import com.ani.octopus.commons.state.dto.StateMachineTransDto;
import com.ani.octopus.commons.state.dto.StateTransDto;

import java.util.List;

/**
 * Created by zsl on 17-4-20.
 */
public class AniStateObjectMessage extends SocketMessage {

    public Long deviceId;
    public Integer slaveId;
    public List<StateTransDto> stateTransDtos;

    public AniStateObjectMessage(ResultCode resultCode, String msg, MessageType messageType, Long deviceId, Integer slaveId, List<StateTransDto> stateTransDtos) {
        super(resultCode, msg, messageType);
        this.deviceId = deviceId;
        this.slaveId = slaveId;
        this.stateTransDtos = stateTransDtos;
    }
}
