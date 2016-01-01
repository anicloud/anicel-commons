package com.anicel.commons.service.bus.observer;

/**
 * the observer who can accept the specified the message.
 * <br><br>
 * Created by zhaoyu on 15-10-30.
 */
public interface MessageObserver {
    void update(MessageObservable o, Object arg);
}
