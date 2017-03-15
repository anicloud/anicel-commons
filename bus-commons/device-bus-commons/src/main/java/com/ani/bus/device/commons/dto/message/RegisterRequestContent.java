package com.ani.bus.device.commons.dto.message;


import com.ani.bus.device.commons.dto.util.MessageUtils;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangbin on 15/10/23
 * Modified by xuben on 16/12/08
 */
public class RegisterRequestContent extends DeviceMessageContent {

    public Integer physicalId;

    public Long physicalAddress;

    public String name;

    public String description;

    public String avatarUrl;

    public List<Integer> tags;

    public Long versionId;

    public Long deviceId;

    public RegisterRequestContent() {
    }

    public RegisterRequestContent(Long deviceId, Integer physicalId, Long physicalAddress, String name, String description, String avatarUrl, List<Integer> tags, Long versionId) {
        this.deviceId = deviceId;
        this.physicalId = physicalId;
        this.physicalAddress = physicalAddress;
        this.name = name;
        this.description = description;
        this.avatarUrl = avatarUrl;
        this.tags = tags;
        this.versionId = versionId;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeLong(deviceId);
        out.writeInt(physicalId);
        out.writeLong(physicalAddress);
        MessageUtils.writeString(out, name);
        MessageUtils.writeString(out, description);
        MessageUtils.writeString(out, avatarUrl);
        if (tags == null) {
            out.writeInt(0);
        } else {
            out.writeInt(tags.size());
            for (Integer tag : tags) {
                out.writeInt(tag);
            }
        }
        out.writeLong(versionId);
    }

    @Override
    public void read(DataInput in) throws IOException {
        deviceId = in.readLong();
        physicalId = in.readInt();
        physicalAddress = in.readLong();
        name = MessageUtils.readString(in);
        description = MessageUtils.readString(in);
        avatarUrl = MessageUtils.readString(in);
        int size = in.readInt();
        if (size > 0) {
            tags = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                tags.add(in.readInt());
            }
        }
        versionId = in.readLong();
    }
}
