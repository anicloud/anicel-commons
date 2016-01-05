package com.ani.bus.device.commons.dto.message;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by huangbin on 10/18/15.
 */
public class Message implements ByteSerializable {
    public MessageType type;
    public MessageContent content;

    public Message() {
    }

    public Message(MessageType type, MessageContent content) {
        this.type = type;
        this.content = content;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeShort(type.getValue());
        content.write(out);
    }

    @Override
    public void read(DataInput in) throws IOException {
        type = MessageType.getType((int) in.readShort());
        switch (type) {
            case REGISTER_REQUEST:
                content = new ContentRegisterRequest();
                break;
            case REGISTER_RESPONSE:
                content = new ContentRegisterResponse();
                break;
            case AUTH_REQUEST:
                content = new ContentAuthRequest();
                break;
            case AUTH_RESPONSE:
                content = new ContentAuthResponse();
                break;
            case UPDATE_REQUEST:
                content = new ContentUpdateRequest();
                break;
            case UPDATE_RESPONSE:
                content = new ContentUpdateResponse();
                break;
            case INVOKE_REQUEST:
                content = new ContentInvokeRequest();
                break;
            case INVOKE_RESPONSE:
                content = new ContentInvokeResponse();
                break;
            default:
                throw new IOException();
        }
        content.read(in);
    }

}
