package com.ani.bus.device.commons.dto.message;

import com.ani.bus.device.commons.dto.device.DeviceSlaveDto;
import com.ani.bus.device.commons.dto.device.FunctionDto;
import com.ani.bus.device.commons.dto.util.MessageUtils;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsl on 17-6-13.
 * Modified by xuben on 18-4-02
 */
public class UpdateSingleRequestContent extends DeviceMessageContent {

    public Integer deviceId;
    public Boolean isRemoved;
    public Integer physicalId;
    public Long physicalAddress;
    public String name;
    public String description;

    public List<FunctionDto> functions;

    public List<Integer> tags;


    public Boolean isactive;

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(deviceId);
        out.writeBoolean(isRemoved);
        if (isRemoved) return;
        out.writeInt(physicalId);
        out.writeLong(physicalAddress);
        MessageUtils.writeString(out, name);
//        MessageUtils.writeString(out, description);
        if (tags == null) {
            out.writeShort(0);
        } else {
            out.writeShort(tags.size());
            for (Integer tag : tags) {
                out.writeInt(tag);
            }
        }
        if (functions == null) {
            out.writeShort(0);
        } else {
            out.writeShort(functions.size());
            for (FunctionDto functionDto : functions) {
                functionDto.write(out);
            }
        }
        out.writeBoolean(isactive);
    }

    @Override
    public void read(DataInput in) throws IOException {
        deviceId = in.readInt();
        isRemoved = in.readBoolean();
        if (isRemoved) return;
        physicalId = in.readInt();
        physicalAddress = in.readLong();
        name = MessageUtils.readString(in);
//        description = MessageUtils.readString(in);
        description = "empty";
        int size = in.readShort();
        if (size > 0) {
            tags = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                tags.add(in.readInt());
            }
        }

        size = in.readShort();
        if (size > 0) {
            functions = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                FunctionDto functionDto = new FunctionDto();
                functionDto.read(in);
                functions.add(functionDto);
            }
        }

//        masterId = in.readLong();
        isactive = in.readBoolean();
    }
}
