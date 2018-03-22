package com.ani.bus.device.commons.dto.device;

import com.ani.bus.device.commons.dto.message.ByteSerializable;
import com.ani.bus.device.commons.dto.util.MessageUtils;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangbin on 12/17/15
 * Modified by xuben on 03/22/18
 */
public class DeviceMasterDto implements ByteSerializable {
    public Integer physicalId;
    public Long physicalAddress;
    public String name;
    public String description;

    public List<FunctionDto> functions;

    public List<Integer> tags;

    public Long deviceId;
    public List<DeviceSlaveDto> slaves;
    public transient Long lastModifiedTime;

    public DeviceMasterDto() {
    }

    public DeviceMasterDto(Integer physicalId, Long physicalAddress, String name, String description, List<FunctionDto> functions, List<Integer> tags, Long deviceId, List<DeviceSlaveDto> slaves, Long lastModifiedTime) {
        this.physicalId = physicalId;
        this.physicalAddress = physicalAddress;
        this.name = name;
        this.description = description;
        this.functions = functions;
        this.tags = tags;
        this.deviceId = deviceId;
        this.slaves = slaves;
    }

    @Override
    public void write(DataOutput out) throws IOException {
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
        out.writeLong(deviceId);
        if (functions == null) {
            out.writeShort(0);
        } else {
            out.writeShort(functions.size());
            for (FunctionDto functionDto : functions) {
                functionDto.write(out);
            }
        }
        if (slaves == null) {
            out.writeShort(0);
        } else {
            out.writeShort(slaves.size());
            for (DeviceSlaveDto slaveDto : slaves) {
                slaveDto.write(out);
            }
        }
    }

    @Override
    public void read(DataInput in) throws IOException {
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
        deviceId = in.readLong();
        size = in.readShort();
        if (size > 0) {
            functions = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                FunctionDto functionDto = new FunctionDto();
                functionDto.read(in);
                functions.add(functionDto);
            }
        }
        size = in.readShort();
        if (size > 0) {
            slaves = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                DeviceSlaveDto slave = new DeviceSlaveDto();
                slave.read(in);
                slaves.add(slave);
            }
        }
        lastModifiedTime = System.currentTimeMillis();
    }

}
