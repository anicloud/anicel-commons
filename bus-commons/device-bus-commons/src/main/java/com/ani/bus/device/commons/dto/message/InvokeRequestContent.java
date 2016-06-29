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
    public void write(DataOutput out) throws IOException {
        instance.write(out);
    }

    @Override
    public void read(DataInput in) throws IOException {
        instance = new FunctionInstance();
        instance.read(in);
    }
}
