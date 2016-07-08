package com.ani.bus.service.commons.message.callmessage;

import com.ani.bus.service.commons.dto.anistub.AniStub;
import com.ani.bus.service.commons.dto.anistub.AniStubConnType;
import com.ani.bus.service.commons.message.MessageType;
import com.ani.bus.service.commons.message.SocketMessage;

/**
 * Created by zhaoyu on 15-10-30.
 */
public class AniObjectMessage extends SocketMessage {

    private Long objectId;

    private String description;

    private Type objMsgType;

    public AniObjectMessage() {
        super(MessageType.OBJECT_MESSAGE);
    }

    public AniObjectMessage(Long objectId, String description, Type objMsgType) {
        super(MessageType.OBJECT_MESSAGE);
        this.objectId = objectId;
        this.description = description;
        this.objMsgType = objMsgType;
    }

    public AniObjectMessage(ResultCode resultCode, String msg, Long objectId, String description, Type objMsgType) {
        super(resultCode, msg, MessageType.OBJECT_MESSAGE);
        this.objectId = objectId;
        this.description = description;
        this.objMsgType = objMsgType;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getObjMsgType() {
        return objMsgType;
    }

    public void setObjMsgType(Type objMsgType) {
        this.objMsgType = objMsgType;
    }

    @Override
    public String toString() {
        return "AniObjectCallMessage{" +
                "objectId=" + objectId +
                ", description=" + description +
                ", objMsgType=" + objMsgType +
                "} " + super.toString();
    }

    public static enum Type {
        DEVICE_CONNECTED,
        DEVICE_DISCONNECTED,
        DEVICE_UPDATED,
        DEVICE_BOUND,
        DEVICE_UNBOUND,
        DEVICE_SHARED,
        DEVICE_UNSHARED,
        ACCOUNT_GROUP_ADDED,
        ACCOUNT_GROUP_REMOVED,
        ACCOUNT_GROUP_MODIFIED,
        ACCOUNT_GROUP_INVITED,
        ACCOUNT_GROUP_DISINVITED,
        ACCOUNT_GROUP_JOINED,
        ACCOUNT_GROUP_QUIT;

        private Type() {
        }
    }
}
