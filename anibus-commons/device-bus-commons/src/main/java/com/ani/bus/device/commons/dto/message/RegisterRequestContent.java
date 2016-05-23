package com.ani.bus.device.commons.dto.message;


import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangbin on 10/23/15.
 */
public class RegisterRequestContent extends DeviceMessageContent {

    public String physicalId;

    public String physicalAddress;

    public String name;

    public String description;

    public String avatarUrl;

    public List<String> tags;

    public Long versionId;

    public RegisterRequestContent() {
    }

    public RegisterRequestContent(String physicalId, String physicalAddress, String name, String description, String avatarUrl, List<String> tags, Long versionId) {
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
        MessageUtils.writeString(out, physicalId);
        MessageUtils.writeString(out, physicalAddress);
        MessageUtils.writeString(out, name);
        MessageUtils.writeString(out, description);
        MessageUtils.writeString(out, avatarUrl);
        if (tags == null) {
            out.writeInt(0);
        } else {
            out.writeInt(tags.size());
            for (String tag : tags) {
                MessageUtils.writeString(out, tag);
            }
        }
        out.writeLong(versionId);
    }

    @Override
    public void read(DataInput in) throws IOException {
        physicalId = MessageUtils.readString(in);
        physicalAddress = MessageUtils.readString(in);
        name = MessageUtils.readString(in);
        description = MessageUtils.readString(in);
        avatarUrl = MessageUtils.readString(in);
        int size = in.readInt();
        if (size > 0) {
            tags = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                tags.add(MessageUtils.readString(in));
            }
        }
        versionId = in.readLong();
    }
}
