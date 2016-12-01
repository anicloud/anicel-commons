package com.ani.bus.device.commons.dto.message;


import com.ani.bus.device.commons.dto.device.FunctionInstance;

import java.io.*;

/**
 * Created by huangbin on 10/27/15.
 */
public class InvokeRequestContent extends DeviceMessageContent {

    public FunctionInstance instance;

    public InvokeRequestContent() {
    }

    public InvokeRequestContent(FunctionInstance instance) {
        this.instance = instance;
    }

    @Override
    public void write(DataOutput out) {
        try {
            instance.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read(DataInput in)  {
        instance = new FunctionInstance();
        try {
            instance.read(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
