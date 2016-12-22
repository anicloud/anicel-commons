package com.ani.bus.device.commons.dto.device;

import com.ani.bus.device.commons.dto.message.ByteSerializable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangbin on 15/10/22
 * Modified by xuben on 16/11/22
 */

/**
 * Function invocation context.
 */
public class FunctionInstance implements ByteSerializable {
    public Long instanceId;
    public Long createTime;

    public Long deviceId;
    public Integer slaveId;
    public Boolean async;
    public FunctionDto function;
    public List<ArgumentDto> inputValues;
    public List<ArgumentDto> outputValues;

    public final Object lock = new Object();
    /*
    *  Fields not to be serialized.
    * */
    public Boolean result;

    public FunctionInstance() {
    }

    public FunctionInstance(Long deviceId, Integer slaveId, Boolean async, FunctionDto function,
                            List<ArgumentDto> inputValues, List<ArgumentDto> outputValues) {
        Long createTime = System.currentTimeMillis();
        Long instanceId = Long.valueOf((createTime.toString() + deviceId.toString() + function.functionId + function.groupId).hashCode());
        this.instanceId = instanceId;
        this.createTime = createTime;
        this.slaveId = slaveId;
        this.deviceId = deviceId;
        this.async = async;
        this.function = function;
        this.inputValues = inputValues;
        this.outputValues = outputValues;
    }

    public FunctionInstance(Long instanceId, Long createTime, Long deviceId, Integer slaveId, Boolean async,
                            FunctionDto function, List<ArgumentDto> inputValues, List<ArgumentDto> outputValues) {
        this.instanceId = instanceId;
        this.createTime = createTime;
        this.slaveId = slaveId;
        this.deviceId = deviceId;
        this.async = async;
        this.function = function;
        this.inputValues = inputValues;
        this.outputValues = outputValues;
        this.result = false;
    }

    @Override
    public void write(DataOutput out) throws IOException {
//        out.writeLong(deviceId);
        out.writeInt(slaveId);
        function.write(out);
        if (inputValues == null) {
            out.writeInt(0);
        } else {
            out.writeInt(inputValues.size());
            for (ArgumentDto arg : inputValues) {
                arg.write(out);
            }
        }
        if (outputValues == null) {
            out.writeInt(0);
        } else {
            out.writeInt(outputValues.size());
            for (ArgumentDto arg : outputValues) {
                arg.write(out);
            }
        }
        out.writeLong(createTime);
        out.writeBoolean(async);
    }

    @Override
    public void read(DataInput in) throws IOException {
//        deviceId = in.readLong();
        slaveId = in.readInt();
        function = new FunctionDto();
        function.read(in);
        int size = in.readInt();
        if (size > 0) {
            inputValues = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                ArgumentDto argument = new ArgumentDto();
                argument.read(in);
                inputValues.add(argument);
            }
        }
        size = in.readInt();
        if (size > 0) {
            outputValues = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                ArgumentDto argument = new ArgumentDto();
                argument.read(in);
                outputValues.add(argument);
            }
        }
        createTime = in.readLong();
        async = in.readBoolean();
    }
}