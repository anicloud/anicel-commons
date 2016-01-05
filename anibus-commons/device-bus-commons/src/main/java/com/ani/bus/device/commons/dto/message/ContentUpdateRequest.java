package com.ani.bus.device.commons.dto.message;

import com.ani.bus.device.commons.dto.device.DeviceMasterDto;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by huangbin on 10/23/15.
 */
public class ContentUpdateRequest extends MessageContent {
    public DeviceMasterDto dto;

    public ContentUpdateRequest() {
    }

    public ContentUpdateRequest(DeviceMasterDto dto) {
        this.dto = dto;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        dto.write(out);
    }

    @Override
    public void read(DataInput in) throws IOException {
        dto = new DeviceMasterDto();
        dto.read(in);
    }
}
