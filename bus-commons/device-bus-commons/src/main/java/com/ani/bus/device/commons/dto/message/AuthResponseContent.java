package com.ani.bus.device.commons.dto.message;



import com.ani.bus.device.commons.dto.device.DeviceMasterDto;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by huangbin on 10/23/15.
 */
public class AuthResponseContent extends DeviceMessageContent {

    public Boolean result;

    public DeviceMasterDto dto;

    public AuthResponseContent() {

    }

    public AuthResponseContent(Boolean result, DeviceMasterDto dto) {
        this.result = result;
        this.dto = dto;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeBoolean(result);
        if (result) {
            dto.write(out);
        }
    }

    @Override
    public void read(DataInput in) throws IOException {
        result = in.readBoolean();
        if (result) {
            dto = new DeviceMasterDto();
            dto.read(in);
        }
    }
}
