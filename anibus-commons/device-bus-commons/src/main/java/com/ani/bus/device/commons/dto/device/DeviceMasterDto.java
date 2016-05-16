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
public class DeviceMasterDto implements ByteSerializable {
    public String physicalId;
    public String physicalAddress;
    public String name;
    public String description;

    public List<FunctionDto> functions;

    public String avatarUrl;
    public List<String> tags;

    public Long deviceId;
    public List<DeviceSlaveDto> slaves;

    public Long owner;
    public List<Long> accountGroups;

    public Long versionId;
    public Long lastModifiedTime;

    public DeviceMasterDto() {
    }

    public DeviceMasterDto(String physicalId, String physicalAddress, String name, String description, List<FunctionDto> functions, String avatarUrl, List<String> tags, Long deviceId, List<DeviceSlaveDto> slaves, Long owner, List<Long> accountGroups, Long versionId, Long lastModifiedTime) {
        this.physicalId = physicalId;
        this.physicalAddress = physicalAddress;
        this.name = name;
        this.description = description;
        this.functions = functions;
        this.avatarUrl = avatarUrl;
        this.tags = tags;
        this.deviceId = deviceId;
        this.slaves = slaves;
        this.owner = owner;
        this.accountGroups = accountGroups;
        this.versionId = versionId;
        this.lastModifiedTime = lastModifiedTime;
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
        MessageUtils.writeString(out, avatarUrl);
        if (tags == null) {
            out.writeInt(0);
        } else {
            out.writeInt(tags.size());
            for (String tag : tags) {
                MessageUtils.writeString(out, tag);
            }
        }
        out.writeLong(deviceId);
        if (slaves == null) {
            out.writeInt(0);
        } else {
            out.writeInt(slaves.size());
            for (DeviceSlaveDto slaveDto : slaves) {
                slaveDto.write(out);
            }
        }
        out.writeLong(owner);
        if (accountGroups == null) {
            out.writeInt(0);
        } else {
            out.writeInt(accountGroups.size());
            for (Long group : accountGroups) {
                out.writeLong(group);
            }
        }
        out.writeLong(versionId);
        out.writeLong(lastModifiedTime);
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
        avatarUrl = MessageUtils.readString(in);
        size = in.readInt();
        if (size > 0) {
            tags = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                tags.add(MessageUtils.readString(in));
            }
        }
        deviceId = in.readLong();
        size = in.readInt();
        if (size > 0) {
            slaves = new ArrayList<>();
            for (int i=0; i<size; i++) {
                DeviceSlaveDto slave = new DeviceSlaveDto();
                slave.read(in);
                slaves.add(slave);
            }
        }
        owner = in.readLong();
        size = in.readInt();
        if (size > 0) {
            accountGroups = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                accountGroups.add(in.readLong());
            }
        }
        versionId = in.readLong();
        lastModifiedTime = in.readLong();
    }
}
