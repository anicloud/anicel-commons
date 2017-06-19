package com.ani.bus.device.commons.dto.message;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by zsl on 17-6-13.
 */
public class StateDtoResponseContent extends DeviceMessageContent {

    public Boolean result;

    public StateDtoResponseContent(Boolean result) {
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
