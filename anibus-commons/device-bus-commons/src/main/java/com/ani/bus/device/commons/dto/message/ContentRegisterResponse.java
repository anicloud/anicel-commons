package com.ani.bus.device.commons.dto.message;


import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by huangbin on 10/23/15.
 */
public class ContentRegisterResponse extends MessageContent {
    public Boolean result;

    public Long deviceId;

    public byte[] token;

    public ContentRegisterResponse() {

    }

    public ContentRegisterResponse(Boolean result, Long deviceId, byte[] token) {
        this.result = result;
        this.deviceId = deviceId;
        this.token = token;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeBoolean(result);
        if (result) {
            out.writeLong(deviceId);
            out.write(token, 0, 16);
        }
    }

    @Override
    public void read(DataInput in) throws IOException {
        result = in.readBoolean();
        if (result) {
            deviceId = in.readLong();
            token = new byte[16];
            in.readFully(token, 0, 16);
        } else {
            deviceId = -1l;
            token = null;
        }
    }
}
