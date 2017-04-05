package com.ani.bus.device.commons.dto.util;

import com.ani.bus.device.commons.dto.message.DeviceMessage;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by huangbin on 10/22/15.
 */
public class MessageUtils {

    private static final Charset charset = Charset.forName("UTF-8");

    private MessageUtils() {

    }

    public static void writeString(DataOutput out, String in) throws IOException {
        if (in == null) {
            out.writeInt(0);
        } else {
            byte[] bytes = in.getBytes(charset);
            out.writeInt(bytes.length);
            out.write(bytes);
        }
    }

    public static String readString(DataInput in) throws IOException {
        int length = in.readInt();
        byte[] bytes = new byte[length];
        in.readFully(bytes, 0, length);
        return new String(bytes);
    }

    public static void writeLong(DataOutput out, Long in) throws IOException {
        if (in == null) {
            out.writeLong(-1l);
        } else {
            out.writeLong(in);
        }
    }

    public static Long readLong(DataInput in) throws IOException {
        return in.readLong();
    }

    @Deprecated //不推荐使用Map传输
    public static void writeMap(DataOutput out, Map map) throws IOException {//TODO 将map结构化传入
        Iterator it = map.keySet().iterator();
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        while (!it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key);
            sb.append(key).append(":").append(value);
        }
        sb.append("}");
        writeString(out, sb.toString());
    }

    @Deprecated
    public static Map readMap(DataInput in) throws IOException {// TODO: 17-3-3
        String mapString = readString(in);
        return null;
//        return new HashMap(mapString);
    }

    public static DeviceMessage decodeMessage(byte[] in) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(in);
        DataInputStream dis = new DataInputStream(bais);
        DeviceMessage message = new DeviceMessage();
        message.read(dis);
        return message;
    }

    public static byte[] encodeMessage(DeviceMessage message) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        try {
            message.write(dos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return baos.toByteArray();
    }


}
