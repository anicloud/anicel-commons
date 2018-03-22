package com.ani.bus.device.commons.dto.message;

import com.ani.bus.device.commons.dto.device.ArgumentDto;
import com.ani.bus.device.commons.dto.util.MessageUtils;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsl on 17-6-13.
 * Modified by xuben on 03/23/18
 */
public class StateDtoRequestContent extends DeviceMessageContent {
    public Integer slaveid;
    public Integer smId;
    public Long stateGroupId;
    public Integer stateId;
    public List<ArgumentDto> properties;

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(slaveid);
        out.writeInt(smId);
//        MessageUtils.writeLong(out, stateGroupId);
        out.writeInt(stateGroupId.intValue());
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
        slaveid = in.readInt();
        smId = in.readInt();
//        stateGroupId = MessageUtils.readLong(in);
        stateGroupId = (long)in.readInt();
        stateId = in.readInt();
        int size = in.readByte();
        properties = new ArrayList<>();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                ArgumentDto argumentDto = new ArgumentDto();
                argumentDto.read(in);
                properties.add(argumentDto);
            }
        }
    }
}
