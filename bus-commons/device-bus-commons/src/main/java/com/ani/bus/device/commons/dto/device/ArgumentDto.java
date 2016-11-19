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
    public ArgumentType argumentType;
    public Object instance;

    public ArgumentDto() {
        argumentType = ArgumentType.NULL;
        instance = null;
    }

    public ArgumentDto(ArgumentType argumentType, Object instance) {
        this.argumentType = argumentType;
        this.instance = instance;
    }

    public Object get() {
        return instance;
    }


    public void write(DataOutput out) throws IOException {
        out.writeByte(argumentType.getValue());

        if (instance == null) { // todo
//            out.writeChar('N');
//        else if (argumentType.isArray()) { // array  todo
//            out.writeChar('[');
//            int len = Array.getLength(instance);
//            out.writeInt(len);
//            for (int i = 0; i < len; i++) {
//                writeObject(out, Array.get(instance, i), argumentType.componentType);
//            }
//        }
        } else if (argumentType == ArgumentType.BOOLEAN) {
            out.writeBoolean((Boolean) instance);
        } else if (argumentType == ArgumentType.CHAR) {
            out.writeChar((Character) instance);
        } else if (argumentType == ArgumentType.BYTE) {
            out.writeByte((Byte) instance);
        } else if (argumentType == ArgumentType.SHORT) {
            out.writeShort((Short) instance);
        } else if (argumentType == ArgumentType.INTEGER) {
            out.writeInt((Integer) instance);
        } else if (argumentType == ArgumentType.LONG) {
            out.writeLong((Long) instance);
        } else if (argumentType == ArgumentType.FLOAT) {
            out.writeFloat((Float) instance);
        } else if (argumentType == ArgumentType.DOUBLE) {
            out.writeDouble((Double) instance);
//        } else if (argumentType == ArgumentType.STRING) {
//            byte[] strBytes = ((String)instance).getBytes(Charset.forName("utf-8"));
//            out.writeInt(strBytes.length);
//            out.write(strBytes);
        } else {
            throw new IOException("cannot write the object type: " + argumentType.name());
        }
    }

    public void read(DataInput in) throws IOException {
        argumentType = null;
        argumentType = ArgumentType.getType(in.readByte());
        switch (argumentType) {
            case BOOLEAN:
                instance = in.readBoolean();
                break;
            case BYTE:
                instance = in.readByte();
                break;
            case CHAR:
                instance = in.readChar();
                break;
            case SHORT:
                instance = in.readShort();
                break;
            case INTEGER:
                instance = in.readInt();
                break;
            case FLOAT:
                instance = in.readFloat();
                break;
            case DOUBLE:
                instance = in.readDouble();
                break;
            default:
                argumentType = ArgumentType.NULL;
                instance = null;
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
