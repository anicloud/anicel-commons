package com.ani.earth.commons.exception;

import org.springframework.jms.JmsException;

/**
 * Created by zhaoyu on 15-12-15.
 */
public class GroupDataException extends JmsException {
    public GroupDataException(String msg) {
        super(msg);
    }

    public GroupDataException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public GroupDataException(Throwable cause) {
        super(cause);
    }
}
