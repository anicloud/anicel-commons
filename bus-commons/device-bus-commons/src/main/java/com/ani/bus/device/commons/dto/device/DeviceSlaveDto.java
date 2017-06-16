package com.ani.bus.device.commons.dto.device;

import com.ani.bus.device.commons.dto.message.ByteSerializable;
import com.ani.bus.device.commons.dto.util.MessageUtils;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangbin on 12/18/15
 * Last Modified by xuben on 05/16/17
 */
public class DeviceSlaveDto implements ByteSerializable {
    public Integer physicalId;
    public Long physicalAddress;
    public String name;
    public String description;

    public List<FunctionDto> functions;

    public String avatarUrl;
    public List<Integer> tags;

    public Integer deviceId;
    public Long masterId;
    public Boolean isactive;

    public DeviceSlaveDto() {

    }

    public DeviceSlaveDto(Integer physicalId, Long physicalAddress, String name, String description, List<FunctionDto> functions, String avatarUrl, List<Integer> tags, Integer deviceId, Long masterId) {
        this.physicalId = physicalId;
        this.physicalAddress = physicalAddress;
        this.name = name;
        this.description = description;
        this.functions = functions;
        this.avatarUrl = avatarUrl;
        this.tags = tags;
        this.deviceId = deviceId;
        this.isactive = true;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(physicalId);
        out.writeLong(physicalAddress);
        MessageUtils.writeString(out, name);
        MessageUtils.writeString(out, description);
        MessageUtils.writeString(out, avatarUrl);
        if (tags == null) {
            out.writeShort(0);
        } else {
            out.writeShort(tags.size());
            for (Integer tag : tags) {
                out.writeInt(tag);
            }
        }
        out.writeInt(deviceId);
        out.writeBoolean(isactive);
        if (functions == null) {
            out.writeShort(0);
        } else {
            out.writeShort(functions.size());
            for (FunctionDto functionDto : functions) {
                functionDto.write(out);
            }
        }
    }

    @Override
    public void read(DataInput in) throws IOException {
        physicalId = in.readInt();
        physicalAddress = in.readLong();
        name = MessageUtils.readString(in);
        description = MessageUtils.readString(in);
        avatarUrl = MessageUtils.readString(in);
        int size = in.readShort();
        if (size > 0) {
            tags = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                tags.add(in.readInt());
            }
        }
        deviceId = in.readInt();
        isactive = in.readBoolean();

        size = in.readShort();
        if (size > 0) {
            functions = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                FunctionDto functionDto = new FunctionDto();
                functionDto.read(in);
                functions.add(functionDto);
            }
        }
    }
}
