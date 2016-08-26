package com.ani.bus.device.commons.dto.message;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by zsl on 16-8-22.
 */
public class HandleMessageContent extends DeviceMessageContent {
    public Long deviceId;

    public String description;

    public long Messagelength;

    public HandleMessageContent() {

    }

    public HandleMessageContent(Long deviceId, String description) {
        this.description = description;
        this.deviceId = deviceId;
        this.Messagelength = description.length();
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeLong(deviceId);
        MessageUtils.writeString(out, description);
        out.writeLong(Messagelength);
    }

    @Override
    public void read(DataInput in) throws IOException {
        deviceId = in.readLong();
        description = MessageUtils.readString(in);
        Messagelength = in.readLong();
    }
}
