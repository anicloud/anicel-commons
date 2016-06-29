package com.ani.bus.device.commons.dto.message;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by huangbin on 10/23/15.
 */
public class AuthRequestContent extends DeviceMessageContent {

    public Long deviceId;

    public Long timestamp;

    public byte[] sign;

    public AuthRequestContent() {

    }

    public AuthRequestContent(Long deviceId, Long timestamp, byte[] sign) {
        this.deviceId = deviceId;
        this.timestamp = timestamp;
        this.sign = sign;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeLong(deviceId);
        out.writeLong(timestamp);
        out.writeInt(sign.length);
        out.write(sign);
    }

    @Override
    public void read(DataInput in) throws IOException {
        deviceId = in.readLong();
        timestamp = in.readLong();
        int len = in.readInt();
        sign = new byte[len];
        in.readFully(sign, 0, len);
    }
}
