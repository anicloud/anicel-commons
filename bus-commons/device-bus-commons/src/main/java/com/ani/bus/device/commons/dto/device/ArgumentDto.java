package com.ani.bus.device.commons.dto.device;

/**
 * Created by huangbin on 10/26/15.
 */

import com.ani.bus.device.commons.dto.message.ByteSerializable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;


public class ArgumentDto implements ByteSerializable {
    public ArgumentType argumentType;
    public Object instance;

    public ArgumentDto() {
        argumentType = null;
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
        writeObject(out, instance, argumentType);
    }

    public void read(DataInput in) throws IOException {
        argumentType = null;
        instance = readObject(in);
    }

    private Object readObject(DataInput in) throws IOException {
        Object value;
        int len;
        switch (in.readChar()) {
            case '[': // array
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
            case 'T': // boolean
                value = in.readBoolean();
                break;
            case 'B': // byte
                value = in.readByte();
                break;
            case 'C': // char
                value = in.readChar();
                break;
            case 'S': // short
                value = in.readShort();
                break;
            case 'I': // int
                value = in.readInt();
                break;
            case 'L': // long
                value = in.readLong();
                break;
            case 'F': // float
                value = in.readFloat();
                break;
            case 'D': // double
                value = in.readDouble();
                break;
            case 'R': // string
                len = in.readInt();
                byte []strBytes = new byte[len];
                in.readFully(strBytes, 0, len);
                value = new String(strBytes, 0, len, Charset.forName("utf-8"));
                break;
            case 'N': // null
            default: // unknown
                value = null;
        }
        return value;
    }

    private void writeObject(DataOutput out, Object instance, ArgumentType argumentType) throws IOException {
        if (instance == null) {
            out.writeChar('N');
        } else if (argumentType.isArray()) { // array
            out.writeChar('[');
            int len = Array.getLength(instance);
            out.writeInt(len);
            for (int i = 0; i < len; i++) {
                writeObject(out, Array.get(instance, i), argumentType.componentType);
            }
        } else if (argumentType.type == ArgumentType.Type.BOOLEAN) {
            out.writeChar('T');
            out.writeBoolean((Boolean) instance);
        } else if (argumentType.type == ArgumentType.Type.CHAR) {
            out.writeChar('C');
            out.writeChar((Character) instance);
        } else if (argumentType.type == ArgumentType.Type.BYTE) {
            out.writeChar('B');
            out.writeByte((Byte) instance);
        } else if (argumentType.type == ArgumentType.Type.SHORT) {
            out.writeChar('S');
            out.writeShort((Short) instance);
        } else if (argumentType.type == ArgumentType.Type.INTEGER) {
            out.writeChar('I');
            out.writeInt((Integer) instance);
        } else if (argumentType.type == ArgumentType.Type.LONG) {
            out.writeChar('L');
            out.writeLong((Long) instance);
        } else if (argumentType.type == ArgumentType.Type.FLOAT) {
            out.writeChar('F');
            out.writeFloat((Float) instance);
        } else if (argumentType.type == ArgumentType.Type.DOUBLE) {
            out.writeChar('D');
            out.writeDouble((Double) instance);
        } else if (argumentType.type == ArgumentType.Type.STRING) {
            out.writeChar('R');
            byte[] strBytes = ((String)instance).getBytes(Charset.forName("utf-8"));
            out.writeInt(strBytes.length);
            out.write(strBytes);
        } else {
            throw new IOException("cannot write the object type: " + argumentType.type.name());
        }

    }

}
