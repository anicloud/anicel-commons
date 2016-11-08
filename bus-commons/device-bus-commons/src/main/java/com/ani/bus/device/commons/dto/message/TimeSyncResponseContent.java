package com.ani.bus.device.commons.dto.message;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by zsl on 16-8-22.
 * Modified by xuben on 16-11-8
 */
public class TimeSyncResponseContent extends DeviceMessageContent {
    public Long timestamp;

    public TimeSyncResponseContent() {
    }

    public TimeSyncResponseContent(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeLong(timestamp);
    }

    @Override
    public void read(DataInput in) throws IOException {
        timestamp = in.readLong();
    }
}
