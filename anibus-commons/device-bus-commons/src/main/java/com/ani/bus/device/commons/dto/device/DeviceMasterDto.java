package com.ani.bus.device.commons.dto.device;

import com.ani.bus.device.commons.dto.message.ByteSerializable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangbin on 12/17/15.
 */
public class DeviceMasterDto extends DeviceDto implements ByteSerializable {
    public Long deviceId;
    public List<DeviceSlaveDto> slaves;

    public Long owner;
    public List<Long> accountGroups;

    public DeviceMasterDto() {
    }

    public DeviceMasterDto(String physicalId, String physicalAddress, String name, String description, List<FunctionDto> functions, String avatarUrl, List<String> tags, Long deviceId, List<DeviceSlaveDto> slaves, Long owner, List<Long> accountGroups) {
        super(physicalId, physicalAddress, name, description, functions, avatarUrl, tags);
        this.deviceId = deviceId;
        this.slaves = slaves;
        this.owner = owner;
        this.accountGroups = accountGroups;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        super.write(out);
        out.writeLong(deviceId);
        if (slaves == null) {
            out.writeInt(0);
        } else {
            out.writeInt(slaves.size());
            for (DeviceDto deviceDto : slaves) {
                deviceDto.write(out);
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
    }

    @Override
    public void read(DataInput in) throws IOException {
        super.read(in);
        deviceId = in.readLong();
        int size = in.readInt();
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
    }
}
