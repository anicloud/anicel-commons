package com.ani.earth.commons.exception;

import org.springframework.jms.JmsException;

/**
 * Created by zhaoyu on 15-12-15.
 */
public class AccountDataException extends JmsException {
    public AccountDataException(String msg) {
        super(msg);
    }

    public AccountDataException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public AccountDataException(Throwable cause) {
        super(cause);
    }
}
