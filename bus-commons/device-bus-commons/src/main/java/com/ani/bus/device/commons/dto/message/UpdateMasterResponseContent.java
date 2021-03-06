package com.ani.bus.device.commons.dto.message;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by zsl on 17-6-14.
 */
public class UpdateMasterResponseContent extends DeviceMessageContent {
    public boolean result;

    public UpdateMasterResponseContent(boolean result) {
        this.result = result;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeBoolean(result);
    }

    @Override
    public void read(DataInput in) throws IOException {
        result = in.readBoolean();
    }
}
