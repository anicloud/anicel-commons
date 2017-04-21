package com.ani.bus.service.commons.message.callmessage;

import com.ani.bus.service.commons.dto.anidevice.DeviceStateDto;
import com.ani.bus.service.commons.message.SocketMessage;

import java.util.List;

/**
 * Created by zsl on 17-4-20.
 */
public class AniStateObjectMessage extends SocketMessage {
    Long masterId;
    Integer slaveId;
    List<DeviceStateDto> stateDtoList;//todo 消息通知时传入object状态

    public AniStateObjectMessage(Long masterId, Integer slaveId, List<DeviceStateDto> stateDtos) {
        this.masterId = masterId;
        this.slaveId = slaveId;
        this.stateDtoList = stateDtos;
    }

}
