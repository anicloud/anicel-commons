package com.ani.bus.device.commons.dto.device;

import com.ani.bus.device.commons.dto.message.ByteSerializable;
import com.ani.bus.device.commons.dto.message.MessageUtils;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangbin on 12/18/15.
 */
public class DeviceSlaveDto implements ByteSerializable {
    public String physicalId;
    public String physicalAddress;
    public String name;
    public String description;

    public List<FunctionDto> functions;

    public String avatarUrl;
    public List<String> tags;

    public Integer deviceId;
    public Long masterId;

    public DeviceSlaveDto() {

    }

    public DeviceSlaveDto(String physicalId, String physicalAddress, String name, String description, List<FunctionDto> functions, String avatarUrl, List<String> tags, Integer deviceId, Long masterId) {
        this.physicalId = physicalId;
        this.physicalAddress = physicalAddress;
        this.name = name;
        this.description = description;
        this.functions = functions;
        this.avatarUrl = avatarUrl;
        this.tags = tags;
        this.deviceId = deviceId;
        this.masterId = masterId;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        MessageUtils.writeString(out, physicalId);
        MessageUtils.writeString(out, physicalAddress);
        MessageUtils.writeString(out, name);
        MessageUtils.writeString(out, description);
        MessageUtils.writeString(out, avatarUrl);
        if (tags == null) {
            out.writeInt(0);
        } else {
            out.writeInt(tags.size());
            for (String tag : tags) {
                MessageUtils.writeString(out, tag);
            }
        }
        out.writeInt(deviceId);
        out.writeLong(masterId);
        if (functions == null) {
            out.writeInt(0);
        } else {
            out.writeInt(functions.size());
            for (FunctionDto functionDto : functions) {
                functionDto.write(out);
            }
        }
    }

    @Override
    public void read(DataInput in) throws IOException {
        physicalId = MessageUtils.readString(in);
        physicalAddress = MessageUtils.readString(in);
        name = MessageUtils.readString(in);
        description = MessageUtils.readString(in);
        avatarUrl = MessageUtils.readString(in);
        int size = in.readInt();
        if (size > 0) {
            tags = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                tags.add(MessageUtils.readString(in));
            }
        }
        deviceId = in.readInt();
        masterId = in.readLong();

        size = in.readInt();
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
