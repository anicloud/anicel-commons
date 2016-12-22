package com.ani.bus.device.commons.dto.device;

import com.ani.bus.device.commons.dto.message.ByteSerializable;
import com.ani.bus.device.commons.dto.message.MessageUtils;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangbin on 15/12/17
 * Modified by xuben on 16/12/08
 */
public class DeviceMasterDto implements ByteSerializable {
    public Integer physicalId;
    public Long physicalAddress;
    public String name;
    public String description;

    public List<FunctionDto> functions;

    public String avatarUrl;
    public List<Integer> tags;

    public Long deviceId;
    public List<DeviceSlaveDto> slaves;

    public Long versionId;
    public Long lastModifiedTime;

    public DeviceMasterDto() {
    }

    public DeviceMasterDto(Integer physicalId, Long physicalAddress, String name, String description, List<FunctionDto> functions, String avatarUrl, List<Integer> tags, Long deviceId, List<DeviceSlaveDto> slaves, Long versionId, Long lastModifiedTime) {
        this.physicalId = physicalId;
        this.physicalAddress = physicalAddress;
        this.name = name;
        this.description = description;
        this.functions = functions;
        this.avatarUrl = avatarUrl;
        this.tags = tags;
        this.deviceId = deviceId;
        this.slaves = slaves;
        this.versionId = versionId;
        this.lastModifiedTime = lastModifiedTime;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(physicalId);
        out.writeLong(physicalAddress);
        MessageUtils.writeString(out, name);
        MessageUtils.writeString(out, description);
        MessageUtils.writeString(out, avatarUrl);
        if (tags == null) {
            out.writeInt(0);
        } else {
            out.writeInt(tags.size());
            for (Integer tag : tags) {
                out.writeInt(tag);
            }
        }
        out.writeLong(versionId);
        out.writeLong(deviceId);
        if (functions == null) {
            out.writeInt(0);
        } else {
            out.writeInt(functions.size());
            for (FunctionDto functionDto : functions) {
                functionDto.write(out);
            }
        }
        if (slaves == null) {
            out.writeInt(0);
        } else {
            out.writeInt(slaves.size());
            for (DeviceSlaveDto slaveDto : slaves) {
                slaveDto.write(out);
            }
        }
        out.writeLong(lastModifiedTime);
    }

    @Override
    public void read(DataInput in) throws IOException {
        physicalId = in.readInt();
        physicalAddress = in.readLong();
        name = MessageUtils.readString(in);
        description = MessageUtils.readString(in);
        avatarUrl = MessageUtils.readString(in);
        int size = in.readInt();
        if (size > 0) {
            tags = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                tags.add(in.readInt());
            }
        }
        versionId = in.readLong();
        deviceId = in.readLong();
        size = in.readInt();
        size = in.readInt();
        if (size > 0) {
            functions = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                FunctionDto functionDto = new FunctionDto();
                functionDto.read(in);
                functions.add(functionDto);
            }
        }
        size = in.readInt();
        if (size > 0) {
            slaves = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                DeviceSlaveDto slave = new DeviceSlaveDto();
                slave.read(in);
                slaves.add(slave);
            }
        }
        lastModifiedTime = in.readLong();
    }

}
