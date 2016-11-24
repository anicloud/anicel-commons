package com.ani.bus.device.commons.dto.device;

/**
 * Created by huangbin on 10/26/15.
 * Modified by xuben on 11/19/16.
 */

import com.ani.bus.device.commons.dto.message.ByteSerializable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ArgumentDto implements ByteSerializable {
    public ArgumentType type;
    public Object value;

    public ArgumentDto() {
        type = ArgumentType.NULL;
        value = null;
    }

    public ArgumentDto(ArgumentType type, Object instance) {
        this.type = type;
        this.value = instance;
    }

    public Object get() {
        return value;
    }


    public void write(DataOutput out) throws IOException {
        out.writeByte(type.getValue());

        try {
            if (value == null) {
            } else if (type == ArgumentType.BOOLEAN) {
                out.writeBoolean(Boolean.valueOf(value.toString()));
            } else if (type == ArgumentType.BYTE) {
                out.writeByte(Byte.valueOf(value.toString()));
            } else if (type == ArgumentType.SHORT) {
                out.writeShort(Short.valueOf(value.toString()));
            } else if (type == ArgumentType.INTEGER) {
                out.writeInt(Integer.valueOf(value.toString()));
            } else if (type == ArgumentType.LONG) {
                out.writeLong(Long.valueOf(value.toString()));
            } else if (type == ArgumentType.FLOAT) {
                out.writeFloat(Float.valueOf(value.toString()));
            } else if (type == ArgumentType.DOUBLE) {
                out.writeDouble(Double.valueOf(value.toString()));
            } else if (type == ArgumentType.CHAR && (value instanceof Character)) {
                char c = (Character) value;
                out.writeChar(c);
            } else {
                throw new IOException("cannot write the object type: " + type.name());
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException(e.getMessage());
        }
    }

    public void read(DataInput in) throws IOException {
        type = null;
        type = ArgumentType.getType(in.readByte());
        switch (type) {
            case BOOLEAN:
                value = in.readBoolean();
                break;
            case BYTE:
                value = in.readByte();
                break;
            case CHAR:
                value = in.readChar();
                break;
            case SHORT:
                value = in.readShort();
                break;
            case INTEGER:
                value = in.readInt();
                break;
            case FLOAT:
                value = in.readFloat();
                break;
            case DOUBLE:
                value = in.readDouble();
                break;
            default:
                type = ArgumentType.NULL;
                value = null;
                break;
        }
    }

}
