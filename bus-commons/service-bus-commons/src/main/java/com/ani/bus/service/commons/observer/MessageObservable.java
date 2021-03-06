package com.ani.bus.service.commons.observer;

import java.util.Vector;

/**
 * The class is the Subject of Observer pattern.
 * <br><<br>
 * Created by zhaoyu on 15-10-30.
 */
public class MessageObservable {
    private Vector<MessageObserver> obs;

    public MessageObservable() {
        this.obs = new Vector<>();
    }

    public synchronized void addObserver(MessageObserver observer) {
        if (observer == null) {
            throw new NullPointerException();
        }
        if (!obs.contains(observer)) {
            obs.addElement(observer);
        }
    }

    public void setObs(Vector<MessageObserver> obs) {
        this.obs = obs;
    }

    public synchronized void deleteObserver(MessageObserver observer) {
        obs.removeElement(observer);
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object object) {
        Object[] arrLocal;
        synchronized (this) {
            arrLocal = obs.toArray();
        }
        for (int i = arrLocal.length-1; i>=0; i--)
            ((MessageObserver)arrLocal[i]).update(this, object);
    }

    public void deleteObservers() {
        obs.removeAllElements();
    }

    public synchronized int countObservers() {
        return obs.size();
    }
}
