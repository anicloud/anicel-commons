package com.ani.bus.device.commons.dto.message;


import com.ani.bus.device.commons.dto.device.DeviceMasterDto;

import java.io.*;

/**
 * Created by huangbin on 10/23/15.
 */
public class UpdateResponseContent extends DeviceMessageContent {

    public Boolean result;

    public DeviceMasterDto dto;

    public UpdateResponseContent() {
    }

    public UpdateResponseContent(Boolean result, DeviceMasterDto dto) {
        this.result = result;
        this.dto = dto;
    }

    @Override
    public void write(DataOutput out) {
        try {
            out.writeBoolean(result);
            if (result) {
                dto.write(out);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void read(DataInput in) {
        try {
            result = in.readBoolean();
            if (result) {
                dto = new DeviceMasterDto();
                dto.read(in);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
