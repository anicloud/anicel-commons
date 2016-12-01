package com.ani.bus.device.commons.dto.message;

import com.ani.bus.device.commons.dto.device.DeviceMasterDto;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by huangbin on 10/23/15.
 */
public class UpdateRequestContent extends DeviceMessageContent {

    public DeviceMasterDto dto;

    public UpdateRequestContent() {
    }

    public UpdateRequestContent(DeviceMasterDto dto) {
        this.dto = dto;
    }

    @Override
    public void write(DataOutput out) {
        try {
            dto.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read(DataInput in) {
        try {
            dto = new DeviceMasterDto();
            dto.read(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
