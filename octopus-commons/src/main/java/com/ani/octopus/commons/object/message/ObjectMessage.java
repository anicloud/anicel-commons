package com.ani.octopus.commons.object.message;

import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

import java.io.Serializable;

/**
 * Created by huangbin on 12/23/15.
 */
public class ObjectMessage implements Serializable {
    public Type type;
    public String description;
    public ObjectQueryDto src;

    public enum Type {
        // device
        DEVICE_CONNECTED,
        DEVICE_DISCONNECTED,
        DEVICE_UPDATED,
        DEVICE_BOUND,
        DEVICE_UNBOUND,
        DEVICE_SHARED,
        DEVICE_UNSHARED,

        // account group
        ACCOUNT_GROUP_ADDED,
        ACCOUNT_GROUP_REMOVED,
        ACCOUNT_GROUP_MODIFIED,
        ACCOUNT_GROUP_INVITED,
        ACCOUNT_GROUP_DISINVITED,
        ACCOUNT_GROUP_JOINED,
        ACCOUNT_GROUP_QUIT,
        ACCOUNT_GROUP_KICK,

        //APP
        APP_BIND,
        APP_UNBIND,
        APP_INSTALL,
        APP_UNINSTALL,
        APP_START,
        APP_STOP;
    }

    public ObjectMessage(Type type, String description, ObjectQueryDto src) {
        this.type = type;
        this.description = description;
        this.src = src;
    }
}
