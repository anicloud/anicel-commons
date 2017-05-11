package com.ani.bus.device.commons.dto.message;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import static com.ani.bus.device.commons.dto.message.DeviceMessageType.TIME_SYNC_REQUEST;

/**
 * Created by huangbin on 10/18/15.
 * Modified by xuben on 11/08/15
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
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void read(DataInput in) throws IOException {
        type = DeviceMessageType.getType((int) in.readShort());
        switch (type) {
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
            case STATE_OBJECT_REQUEST:
                content = new StateMachineInitRequestContent();
                break;
            case STATE_OBJECT_RESPONSE:
                content = new StateMachineInitResponseContent();
                break;
            case STATES_OBJECT_REQUEST:
                content = new StateMachinesInitRequestContent();
                break;
            case STATES_OBJECT_RESPONSE:
                content = new StateMachinesInitResponseContent();
                break;
            case STATE_UPDATE_REQUEST:
                content = new StateUpdateRequestContent();
                break;
            case STATE_UPDATE_RESPONSE:
                content = new StateUpdateResponseContent();
                break;

            default:
                throw new IOException();
        }
        try {
            content.read(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
