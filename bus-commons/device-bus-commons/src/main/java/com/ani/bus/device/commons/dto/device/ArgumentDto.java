package com.ani.bus.device.commons.dto.device;

/**
 * Created by huangbin on 10/26/15.
 * Modified by xuben on 10/20/17.
 */

import com.ani.bus.device.commons.dto.util.MessageUtils;
import com.ani.bus.device.commons.dto.message.ByteSerializable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArgumentDto implements ByteSerializable {
    private ArgumentObject argo;

    public ArgumentDto() {
        argo = new ArgumentObject();
        argo.type = ArgumentType.NULL;
        argo.value = null;
    }

    public ArgumentDto(ArgumentType type, Object instance) {
        argo = new ArgumentObject();
        argo.type = type;
        argo.value = instance;
    }

    public Object get() {
        return argo.value;
    }

    public ArgumentType getArgoType() {
        return argo.type;
    }

    public Object getArgoValue() {
        return argo.value;
    }

    public void setArgoType(ArgumentType type) {
        argo.type = type;
    }

    public void setArgoValue(Object obj) {
        argo.value = obj;
    }


    private final void writeArgObject(DataOutput out, ArgumentObject ao) throws IOException {
        out.writeByte(ao.type.getValue());
        if (ao.type == ArgumentType.NULL || ao.value == null) {// TODO: 17-10-19
        } else if (ao.type == ArgumentType.BOOLEAN) {
            out.writeBoolean(Boolean.valueOf(ao.value.toString()));
        } else if (ao.type == ArgumentType.CHAR && (ao.value instanceof Character)) {
            char c = (Character) ao.value;
            out.writeChar(c);
        } else if (ao.type == ArgumentType.BYTE) {
            out.writeByte(Byte.valueOf(ao.value.toString()));
        } else if (ao.type == ArgumentType.SHORT) {
            out.writeShort(Short.valueOf(ao.value.toString()));
        } else if (ao.type == ArgumentType.INTEGER) {
            out.writeInt(Integer.valueOf(ao.value.toString()));
        } else if (ao.type == ArgumentType.LONG) {
            out.writeLong(Long.valueOf(ao.value.toString()));
        } else if (ao.type == ArgumentType.FLOAT) {
            out.writeFloat(Float.valueOf(ao.value.toString()));
        } else if (ao.type == ArgumentType.DOUBLE) {
            out.writeDouble(Double.valueOf(ao.value.toString()));
        } else if (ao.type == ArgumentType.STRING) {
            MessageUtils.writeString(out, ao.value.toString());
        } else if (ao.type == ArgumentType.ARRAY && ao.value instanceof ArrayList) {
            ArrayList al = (ArrayList) ao.value;
            if (al.size() <= 0) {
                throw new IOException("the size of array is 0");
            }
            out.writeByte(ArgumentType.getTypeValue(al.get(0)));
            out.writeInt(al.size());
            if (al.get(0) instanceof Boolean) {
                ArrayList<Boolean> alt = (ArrayList<Boolean>) al;
                for (Boolean b : alt) {
                    out.writeBoolean(b);
                }
            } else if (al.get(0) instanceof Character) {
                ArrayList<Character> alt = (ArrayList<Character>) al;
                for (Character c : alt) {
                    out.writeChar(c);
                }
            } else if (al.get(0) instanceof Byte) {
                ArrayList<Byte> alt = (ArrayList<Byte>) al;
                for (Byte b : alt) {
                    out.writeByte(b);
                }
            } else if (al.get(0) instanceof Short) {
                ArrayList<Short> alt = (ArrayList<Short>) al;
                for (Short s : alt) {
                    out.writeShort(s);
                }
            } else if (al.get(0) instanceof Integer) {
                ArrayList<Integer> alt = (ArrayList<Integer>) al;
                for (Integer i : alt) {
                    out.writeInt(i);
                }
            } else if (al.get(0) instanceof Long) {
                ArrayList<Long> alt = (ArrayList<Long>) al;
                for (Long l : alt) {
                    out.writeLong(l);
                }
            } else if (al.get(0) instanceof Float) {
                ArrayList<Float> alt = (ArrayList<Float>) al;
                for (Float f : alt) {
                    out.writeFloat(f);
                }
            } else if (al.get(0) instanceof Double) {
                ArrayList<Double> alt = (ArrayList<Double>) al;
                for (Double d : alt) {
                    out.writeDouble(d);
                }
            }

        } else if (ao.type == ArgumentType.COLLECTION) {
            List<ArgumentObject> valuelist = (List<ArgumentObject>) ao.value;
            out.writeInt(valuelist.size());
            for (ArgumentObject a : valuelist) {
                writeArgObject(out, a);
            }
        } else {
            throw new IOException("cannot write the object type: " + ao.type.name());
        }
    }

    public void write(DataOutput out) throws IOException {
        try {
            writeArgObject(out, argo);
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException(e.getMessage());
        }
    }
/*

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
*/

    private final ArgumentObject readArgObject(DataInput in) throws IOException {
        ArgumentObject ao = new ArgumentObject();
        ao.type = ArgumentType.getType(in.readByte());
        switch (ao.type) {
            case BOOLEAN:
                ao.value = in.readBoolean();
                break;
            case CHAR:
                ao.value = in.readChar();
                break;
            case BYTE:
                ao.value = in.readByte();
                break;
            case SHORT:
                ao.value = in.readShort();
                break;
            case INTEGER:
                ao.value = in.readInt();
                break;
            case LONG:
                ao.value = in.readLong();
                break;
            case FLOAT:
                ao.value = in.readFloat();
                break;
            case DOUBLE:
                ao.value = in.readDouble();
                break;
            case STRING:
                ao.value = MessageUtils.readString(in);
                break;
            case ARRAY:
                ArgumentType at = ArgumentType.getType(in.readByte());
                int size = in.readInt();
                ArrayList alt;
                switch (at) {
                    case BOOLEAN:
                        alt = new ArrayList<Boolean>(size);
                        for (int i = 0; i < size; i++) {
                            alt.add(in.readBoolean());
                        }
                        break;
                    case CHAR:
                        alt = new ArrayList<Character>(size);
                        for (int i = 0; i < size; i++) {
                            alt.add(in.readChar());
                        }
                        break;
                    case BYTE:
                        alt = new ArrayList<Byte>(size);
                        for (int i = 0; i < size; i++) {
                            alt.add(in.readByte());
                        }
                        break;
                    case SHORT:
                        alt = new ArrayList<Short>(size);
                        for (int i = 0; i < size; i++) {
                            alt.add(in.readShort());
                        }
                        break;
                    case INTEGER:
                        alt = new ArrayList<Integer>(size);
                        for (int i = 0; i < size; i++) {
                            alt.add(in.readInt());
                        }
                        break;
                    case LONG:
                        alt = new ArrayList<Long>(size);
                        for (int i = 0; i < size; i++) {
                            alt.add(in.readLong());
                        }
                        break;
                    case FLOAT:
                        alt = new ArrayList<Float>(size);
                        for (int i = 0; i < size; i++) {
                            alt.add(in.readFloat());
                        }
                        break;
                    case DOUBLE:
                        alt = new ArrayList<Double>(size);
                        for (int i = 0; i < size; i++) {
                            alt.add(in.readDouble());
                        }
                        break;
                    default:
                        alt = null;
                        break;
                }
                ao.value = alt;
                break;
            case COLLECTION:
                int length = in.readInt();
                ArrayList<ArgumentObject> list = new ArrayList<ArgumentObject>(length);
                for (int i = 0; i < length; i++) {
                    list.add(readArgObject(in));
                }
                ao.value = list;
                break;
            default:
                ao.type = ArgumentType.NULL;
                ao.value = null;
                break;
        }
        return ao;
    }

    public void read(DataInput in) throws IOException {
        try {
            ArgumentObject ao = readArgObject(in);
            argo.type = ao.type;
            argo.value = ao.value;
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException(e.getMessage());
        }
    }

/*
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
*/

}
