package com.ani.bus.device.commons.dto.message;


import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by huangbin on 10/23/15.
 */
public class ContentRegisterRequest extends MessageContent {

    public String physicalId;

    public String physicalAddress;

    public String name;

    public String description;

    public ContentRegisterRequest() {
    }

    public ContentRegisterRequest(String physicalId, String physicalAddress, String name, String description) {
        this.physicalId = physicalId;
        this.physicalAddress = physicalAddress;
        this.name = name;
        this.description = description;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        MessageUtils.writeString(out, physicalId);
        MessageUtils.writeString(out, physicalAddress);
        MessageUtils.writeString(out, name);
        MessageUtils.writeString(out, description);
    }

    @Override
    public void read(DataInput in) throws IOException {
        physicalId = MessageUtils.readString(in);
        physicalAddress = MessageUtils.readString(in);
        name = MessageUtils.readString(in);
        description = MessageUtils.readString(in);
    }
}
