package com.ani.octopus.commons.message;

/**
 * Created by zhaoyu on 15-12-9.
 */
public class OctopusHttpMessage<T> extends OctopusMessage {
    private T returnObj;

    public OctopusHttpMessage() {
    }

    public OctopusHttpMessage(T returnObj) {
        this.returnObj = returnObj;
    }

    public OctopusHttpMessage(ResultCode resultCode, String msg, T returnObj) {
        super(resultCode, msg);
        this.returnObj = returnObj;
    }

    public T getReturnObj() {
        return returnObj;
    }

    public void setReturnObj(T returnObj) {
        this.returnObj = returnObj;
    }

    @Override
    public String toString() {
        return "HttpMessage{" +
                "returnObj=" + returnObj +
                "} " + super.toString();
    }
}
