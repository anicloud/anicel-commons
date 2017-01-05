package com.ani.bus.device.commons.dto.device;

/**
 * Created by huangbin on 10/26/15.
 * Modified by xuben on 11/19/16.
 */

import com.ani.bus.device.commons.dto.MessageUtils;
import com.ani.bus.device.commons.dto.message.ByteSerializable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
            } else if (type == ArgumentType.CHAR && (value instanceof Character)) {
                char c = (Character) value;
                out.writeChar(c);
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
            } else if (type == ArgumentType.STRING) {
                MessageUtils.writeString(out, value.toString());
            } else if (type == ArgumentType.ARRAY) {
                List valuelist = (List) value;
                out.writeInt(valuelist.size());
                this.writeArray(out, valuelist);
            } else {
                throw new IOException("cannot write the object type: " + type.name());
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException(e.getMessage());
        }
    }

    private void writeArray(DataOutput out, List valuelist) throws IOException {
        List<ArgumentDto> argumentDtos = new ArrayList<>(valuelist);
        if (valuelist.size() < 1) return;
        out.writeByte(argumentDtos.get(0).type.getValue());
        for (int i = 0; i < valuelist.size(); i++) {
            try {
                if (value == null) {
                } else if (type == ArgumentType.BOOLEAN) {
                    out.writeBoolean(Boolean.valueOf(value.toString()));
                } else if (type == ArgumentType.CHAR && (value instanceof Character)) {
                    char c = (Character) value;
                    out.writeChar(c);
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
                } else if (type == ArgumentType.STRING) {
                    MessageUtils.writeString(out, value.toString());
                } else {
                    throw new IOException("cannot write the object type: " + type.name());
                }
            } catch (IOException e) {
                e.printStackTrace();
                throw new IOException(e.getMessage());
            }
        }
    }

    public void read(DataInput in) throws IOException {
        type = null;
        type = ArgumentType.getType(in.readByte());
        switch (type) {
            case BOOLEAN:
                value = in.readBoolean();
                break;
            case CHAR:
                value = in.readChar();
                break;
            case BYTE:
                value = in.readByte();
                break;
            case SHORT:
                value = in.readShort();
                break;
            case INTEGER:
                value = in.readInt();
                break;
            case LONG:
                value = in.readLong();
                break;
            case FLOAT:
                value = in.readFloat();
                break;
            case DOUBLE:
                value = in.readDouble();
                break;
            case STRING:
                value = MessageUtils.readString(in);
                break;
            case ARRAY:
                int length = in.readInt();
                List<ArgumentDto> list = new ArrayList(length);
                ArgumentType argumentType = ArgumentType.getType(in.readByte());
                for (int i = 0; i < length; i++) {
                    ArgumentDto argumentDto = new ArgumentDto(argumentType, this.readArray(in, argumentType));
                    list.add(argumentDto);
                }
                value = list;
                break;
            default:
                type = ArgumentType.NULL;
                value = null;
                break;
        }
    }

    public Object readArray(DataInput in, ArgumentType argumentType) throws IOException {
        Object object = null;
        switch (argumentType) {
            case BOOLEAN:
                object = in.readBoolean();
                break;
            case CHAR:
                object = in.readChar();
                break;
            case BYTE:
                object = in.readByte();
                break;
            case SHORT:
                object = in.readShort();
                break;
            case INTEGER:
                object = in.readInt();
                break;
            case LONG:
                object = in.readLong();
                break;
            case FLOAT:
                object = in.readFloat();
                break;
            case DOUBLE:
                object = in.readDouble();
                break;
            case STRING:
                object = MessageUtils.readString(in);
                break;
            default:
                type = ArgumentType.NULL;
                object = null;
                break;
        }
        return object;
    }

}
