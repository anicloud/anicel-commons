package com.ani.bus.device.commons.dto.message;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by zsl on 16-8-22.
 */
public class GetTimeContent extends DeviceMessageContent {
    public Long systemtime;

    public GetTimeContent() {

    }

    public GetTimeContent(Long time) {
        this.systemtime = time;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeLong(systemtime);
    }

    @Override
    public void read(DataInput in) throws IOException {
        systemtime = in.readLong();
    }
}
