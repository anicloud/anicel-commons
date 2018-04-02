package com.ani.bus.device.commons.dto.message;


import com.ani.bus.device.commons.dto.util.MessageUtils;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangbin on 10/23/15
 * Modified by xuben on 04/02/18
 */
public class RegisterRequestContent extends DeviceMessageContent {

    public Integer physicalId;

    public Long physicalAddress;

    public String name;

    public String description;


    public List<Integer> tags;


    public Long deviceId;

    public RegisterRequestContent() {
    }

    public RegisterRequestContent(Long deviceId, Integer physicalId, Long physicalAddress, String name, String description, List<Integer> tags) {
        this.deviceId = deviceId;
        this.physicalId = physicalId;
        this.physicalAddress = physicalAddress;
        this.name = name;
        this.description = description;
        this.tags = tags;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeLong(deviceId);
        out.writeInt(physicalId);
        out.writeLong(physicalAddress);
//        MessageUtils.writeString(out, name);
//        MessageUtils.writeString(out, description);
//        if (tags == null) {
//            out.writeShort(0);
//        } else {
//            out.writeShort(tags.size());
//            for (Integer tag : tags) {
//                out.writeInt(tag);
//            }
//        }
    }

    @Override
    public void read(DataInput in) throws IOException {
        deviceId = in.readLong();
        physicalId = in.readInt();
        physicalAddress = in.readLong();
//        name = MessageUtils.readString(in);
//        description = MessageUtils.readString(in);
        description = "empty";
//        int size = in.readShort();
//        if (size > 0) {
//            tags = new ArrayList<>();
//            for (int i = 0; i < size; i++) {
//                tags.add(in.readInt());
//            }
//        }
    }
}
