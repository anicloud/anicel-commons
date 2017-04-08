package com.ani.bus.device.commons.dto.message;


import com.ani.bus.device.commons.dto.device.DeviceMasterDto;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by xuben on 04/08/17.
 */
public class StateUpdateResponseContent extends DeviceMessageContent {

    public Boolean result;


    public StateUpdateResponseContent() {
    }

    public StateUpdateResponseContent(Boolean result) {
        this.result = result;
    }

    @Override
    public void write(DataOutput out) {
        try {
            out.writeBoolean(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void read(DataInput in) {
        try {
            result = in.readBoolean();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
