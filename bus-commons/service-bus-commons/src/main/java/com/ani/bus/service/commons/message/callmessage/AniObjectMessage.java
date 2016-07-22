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

    private Object objectInfo;


    public AniObjectMessage() {
        super(MessageType.OBJECT_MESSAGE);
    }

    public AniObjectMessage(Long objectId, String description, Type objMsgType,Object objectInfo) {
        super(MessageType.OBJECT_MESSAGE);
        this.objectId = objectId;
        this.description = description;
        this.objMsgType = objMsgType;
        this.objectInfo = objectInfo;
    }

    public AniObjectMessage(ResultCode resultCode, String msg, Long objectId, String description, Type objMsgType, Object objectInfo) {
        super(resultCode, msg, MessageType.OBJECT_MESSAGE);
        this.objectId = objectId;
        this.description = description;
        this.objMsgType = objMsgType;
        this.objectInfo = objectInfo;
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


    public Object getObjectInfo() {
        return objectInfo;
    }
    public void setObjectInfo(Object objectInfo) {
        this.objectInfo = objectInfo;
    }

    @Override
    public String toString() {
        return "AniObjectMessage{" +
                "objectId=" + objectId +
                ", description='" + description + '\'' +
                ", objMsgType=" + objMsgType +
                ", objectInfo=" + objectInfo +
                '}';
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
