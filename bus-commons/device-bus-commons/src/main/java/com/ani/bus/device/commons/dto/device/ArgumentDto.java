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

        if (value == null) { // // TODO: 16-11-19  
//            out.writeChar('N');
//        else if (type.isArray()) { // array  // TODO: 16-11-19  
//            out.writeChar('[');
//            int len = Array.getLength(value);
//            out.writeInt(len);
//            for (int i = 0; i < len; i++) {
//                writeObject(out, Array.get(value, i), type.componentType);
//            }
//        }
        } else if (type == ArgumentType.BOOLEAN) {
            out.writeBoolean((Boolean) value);
        } else if (type == ArgumentType.CHAR) {
            out.writeChar((Character) value);
        } else if (type == ArgumentType.BYTE) {
            out.writeByte((Byte) value);
        } else if (type == ArgumentType.SHORT) {
            out.writeShort((Short) value);
        } else if (type == ArgumentType.INTEGER) {
            out.writeInt((Integer) value);
        } else if (type == ArgumentType.LONG) {
            out.writeLong((Long) value);
        } else if (type == ArgumentType.FLOAT) {
            out.writeFloat((Float) value);
        } else if (type == ArgumentType.DOUBLE) {
            out.writeDouble((Double) value);
//        } else if (type == ArgumentType.STRING) { // TODO: 16-11-19  
//            byte[] strBytes = ((String)value).getBytes(Charset.forName("utf-8"));
//            out.writeInt(strBytes.length);
//            out.write(strBytes);
        } else {
            throw new IOException("cannot write the object type: " + type.name());
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
/*            case '[': // array
                len = in.readInt();
                Object[] components;
                if (len > 0) {
                    components = new Object[len];
                    for (int i = 0; i < len; i++) {
                        components[i] = readObject(in);
                        if (components[i] == null) { // An array's all elements are supposed to be primitive.
                            components = null;
                            break;
                        }
                    }
                    if (components != null) {
                        value = Array.newInstance(components[0].getClass(), len);
                        for (int i = 0; i < len; i++) {
                            Array.set(value, i, components[i]);
                        }
                    } else {
                        value = null;
                    }
                } else {
                    value = null;
                }
                break;
            case 'R': // string
                len = in.readInt();
                byte[] strBytes = new byte[len];
                in.readFully(strBytes, 0, len);
                value = new String(strBytes, 0, len, Charset.forName("utf-8"));
                break;
        }
        */
    }

}
