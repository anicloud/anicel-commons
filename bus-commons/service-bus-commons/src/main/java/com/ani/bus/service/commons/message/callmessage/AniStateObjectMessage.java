package com.ani.bus.service.commons.message.callmessage;

import com.ani.bus.service.commons.dto.anidevice.DeviceStateDto;
import com.ani.bus.service.commons.message.SocketMessage;
import com.ani.octopus.commons.state.dto.StateMachineTransDto;

import java.util.List;

/**
 * Created by zsl on 17-4-20.
 */
public class AniStateObjectMessage extends SocketMessage {

    public StateMachineTransDto stateMachineTransDto;

    public AniStateObjectMessage(StateMachineTransDto stateMachineTransDto) {
        this.stateMachineTransDto = stateMachineTransDto;
    }

}
