package com.ani.octopus.commons.message.http;

import java.io.Serializable;

/**
 * Created by zhaoyu on 15-12-9.
 */
public abstract class Message implements Serializable {
    private static final long serialVersionUID = 8363025765626817366L;

    private ResultCode resultCode;
    private String msg;

    public Message() {
    }

    public Message(ResultCode resultCode, String msg) {
        if (resultCode == null) {
            throw new IllegalArgumentException("resultCode cannot be null");
        }
        this.resultCode = resultCode;
        this.msg = msg;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

    public void setResultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static enum ResultCode {
        SUCCESS(1000),

        AUTH_ERROR(2001),
        RULE_ERROR(2002),
        DATA_ERROR(2003),
        IO_ERROR(2004),
        DUPLICATE_KEY_ERROR(2005),

        OBJECT_CALL_ERROR(3001),
        SERVICE_CALL_ERROR(3002);

        private int code;

        ResultCode(int code) {
            this.code = code;
        }

        public int getCode() {
            return this.code;
        }

        public static Message.ResultCode getResultCode(final int code) {
            if (code >= 1000 && code <= 4000) {
                switch (code) {
                    case 1000:
                        return SUCCESS;
                    case 2005:
                        return DUPLICATE_KEY_ERROR;
                    case 2001:
                        return AUTH_ERROR;
                    case 2002:
                        return RULE_ERROR;
                    case 2003:
                        return DATA_ERROR;
                    case 2004:
                        return IO_ERROR;
                    case 3001:
                        return OBJECT_CALL_ERROR;
                    case 3002:
                        return SERVICE_CALL_ERROR;
                    default:
                        return IO_ERROR;
                }
            } else {
                throw new IllegalArgumentException("Invalid code: " + code);
            }
        }
    }

    @Override
    public String toString() {
        return "Message{" +
                "resultCode=" + resultCode +
                ", msg='" + msg + '\'' +
                '}';
    }
}
