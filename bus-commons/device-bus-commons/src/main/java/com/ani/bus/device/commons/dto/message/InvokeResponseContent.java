package com.ani.bus.device.commons.dto.message;


import com.ani.bus.device.commons.dto.device.FunctionInstance;

import java.io.*;

/**
 * Created by huangbin on 10/27/15.
 */
public class InvokeResponseContent extends DeviceMessageContent {

    public Boolean result;

    public FunctionInstance instance;

    public InvokeResponseContent() {
    }

    public InvokeResponseContent(Boolean result, FunctionInstance instance) {
        this.result = result;
        this.instance = instance;
    }

    @Override
    public void write(DataOutput out) {
        try {
            out.writeBoolean(result);
            instance.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read(DataInput in) {
        try {
            result = in.readBoolean();
            instance = new FunctionInstance();
            instance.read(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
