package com.ani.bus.device.commons.dto.device;

import com.ani.bus.device.commons.dto.message.ByteSerializable;
import com.ani.bus.device.commons.dto.message.MessageUtils;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangbin on 12/17/15.
 */
public class DeviceDto implements ByteSerializable {
    public String physicalId;
    public String physicalAddress;
    public String name;
    public String description;

    public List<FunctionDto> functions;

    public String avatarUrl;
    public List<String> tags;

    public DeviceDto() {
    }

    public DeviceDto(String physicalId, String physicalAddress, String name, String description, List<FunctionDto> functions, String avatarUrl, List<String> tags) {
        this.physicalId = physicalId;
        this.physicalAddress = physicalAddress;
        this.name = name;
        this.description = description;
        this.functions = functions;
        this.avatarUrl = avatarUrl;
        this.tags = tags;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        MessageUtils.writeString(out, physicalId);
        MessageUtils.writeString(out, physicalAddress);
        MessageUtils.writeString(out, name);
        MessageUtils.writeString(out, description);
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

        int size = in.readInt();
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
