package com.ani.bus.device.commons.dto.message;



import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by huangbin on 10/23/15.
 */
public class ContentAuthResponse extends MessageContent {

    public Boolean result;

    public ContentAuthResponse() {

    }

    public ContentAuthResponse(Boolean result) {
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
