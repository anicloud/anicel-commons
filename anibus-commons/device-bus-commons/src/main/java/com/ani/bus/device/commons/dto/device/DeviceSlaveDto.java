package com.ani.bus.device.commons.dto.device;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.List;

/**
 * Created by huangbin on 12/18/15.
 */
public class DeviceSlaveDto extends DeviceDto {
    public Integer deviceId;
    public Long masterId;

    public DeviceSlaveDto() {

    }

    public DeviceSlaveDto(String physicalId, String physicalAddress, String name, String description, List<FunctionDto> functions, Integer deviceId, Long masterId) {
        super(physicalId, physicalAddress, name, description, functions);
        this.deviceId = deviceId;
        this.masterId = masterId;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        super.write(out);
    }

    @Override
    public void read(DataInput in) throws IOException {
        super.read(in);
    }
}
