package com.ani.bus.device.commons.dto.statemachine;

import com.ani.bus.device.commons.dto.device.ArgumentDto;
import com.ani.bus.device.commons.dto.message.ByteSerializable;
import com.ani.bus.device.commons.dto.util.MessageUtils;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsl on 17-3-24.
 */
public class DeviceStateDBDto implements ByteSerializable {
    public Long stateGroupId;
    public Integer stateId;
    public List<ArgumentDto> properties;

    public DeviceStateDBDto() {

    }

    public DeviceStateDBDto(Long stateGroupId, Integer stateId) {
        this.stateGroupId = stateGroupId;
        this.stateId = stateId;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        MessageUtils.writeLong(out, stateGroupId);
        out.writeInt(stateId);
        if (properties == null) out.writeInt(0);
        else {
            out.writeInt(properties.size());
            for (ArgumentDto argumentDto : properties)
                argumentDto.write(out);
        }
    }

    @Override
    public void read(DataInput in) throws IOException {
        stateGroupId = MessageUtils.readLong(in);
        stateId = in.readInt();
        int size = in.readByte();
        properties = new ArrayList<>();//TODO 合并list 参数的读写
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                ArgumentDto argumentDto = new ArgumentDto();
                argumentDto.read(in);
                properties.add(argumentDto);
            }
        }
    }
}
