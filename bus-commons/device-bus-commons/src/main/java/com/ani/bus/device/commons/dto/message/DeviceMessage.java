package com.ani.bus.device.commons.dto.message;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.EOFException;
import java.io.IOException;
import java.util.logging.Logger;

import static com.ani.bus.device.commons.dto.message.DeviceMessageType.TIME_SYNC_REQUEST;

/**
 * Created by huangbin on 10/18/15.
 * Modified by xuben on 06/15/17
 */
public class DeviceMessage implements ByteSerializable {
    public DeviceMessageType type;
    public DeviceMessageContent content;

    public DeviceMessage() {
    }

    public DeviceMessage(DeviceMessageType type, DeviceMessageContent content) {
        this.type = type;
        this.content = content;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        try {
            out.writeShort(type.getValue());
            content.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void read(DataInput in) throws IOException {

            type = DeviceMessageType.getType((int) in.readShort());
            switch (type) {
                case HEART_BEAT_REQUEST:
                    content = new HeartBeatRequestContent();
                    break;
                case HEART_BEAT_RESPONSE:
                    content = new HeartBeatResponseContent();
                    break;
                case REGISTER_REQUEST:
                    content = new RegisterRequestContent();
                    break;
                case REGISTER_RESPONSE:
                    content = new RegisterResponseContent();
                    break;
                case AUTH_REQUEST:
                    content = new AuthRequestContent();
                    break;
                case AUTH_RESPONSE:
                    content = new AuthResponseContent();
                    break;
                case UPDATE_REQUEST:
                    content = new UpdateRequestContent();
                    break;
                case UPDATE_RESPONSE:
                    content = new UpdateResponseContent();
                    break;
                case INVOKE_REQUEST:
                    content = new InvokeRequestContent();
                    break;
                case INVOKE_RESPONSE:
                    content = new InvokeResponseContent();
                    break;
                case TIME_SYNC_REQUEST:
                    content = new TimeSyncRequestContent();
                    break;
                case TIME_SYNC_RESPONSE:
                    content = new TimeSyncResponseContent();
                    break;
                case ON_STATES_OBJECT_REQUEST:
                    content = new OnStateMachinesInitRequestContent();
                    break;
                case UPDATE_MASTER_REQUEST:
                    content = new UpdateMasterRequestContent();
                    break;
                case UPDATE_SLAVE_REQUEST:
                    content = new UpdateSingleRequestContent();
                    break;
                case STATEDTO_REQUEST:
                    content = new StateDtoRequestContent();
                    break;
                default:
                    System.out.println("Receive error Type :" + type);
                    throw new IOException();
            }
            content.read(in);

    }

}
