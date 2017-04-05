package com.ani.bus.device.commons.dto.util;

import com.ani.bus.device.commons.dto.device.ArgumentDto;
import com.ani.bus.device.commons.dto.message.ByteSerializable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsl on 17-3-27.
 */
public class ArrayDto implements ByteSerializable {
    private List list;

    public ArrayDto(List list) {
        this.list = list;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        if (list == null) {
            out.writeByte(0);
        } else {
            out.writeByte(list.size());
            for (Object object : list) {
                try {
                    Class clazz = object.getClass();
                    Method method = clazz.getMethod("write", DataOutput.class);
                    method.invoke(object, out);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Deprecated
    @Override
    public void read(DataInput in) throws IOException {
        int size = in.readByte();
        if (size > 0) {
            this.list = new ArrayList();
            for (int i = 0; i < size; i++) {
                ArgumentDto argument = new ArgumentDto();
                argument.read(in);
                list.add(argument);
//                try {
//                    Class clazz = object.getClass();
//                    Method method = clazz.getMethod("read", DataOutput.class);
//                    method.invoke(object, in);
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                } catch (InvocationTargetException e) {
//                    e.printStackTrace();
//                } catch (NoSuchMethodException e) {
//                    e.printStackTrace();
//                }
            }
        }
    }

}
