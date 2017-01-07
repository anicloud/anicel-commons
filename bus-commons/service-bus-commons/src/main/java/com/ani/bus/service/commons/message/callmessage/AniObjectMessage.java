package com.ani.bus.service.commons.message.callmessage;

import com.ani.bus.service.commons.dto.anidevice.DeviceMasterObjInfoDto;
import com.ani.bus.service.commons.message.MessageType;
import com.ani.bus.service.commons.message.SocketMessage;
import com.ani.octopus.commons.message.object.Type;

/**
 * Created by zhaoyu on 15-10-30.
 */
public class AniObjectMessage extends SocketMessage {

    private Long objectId;

    private String description;

    private Type objMsgType;

    private Long userId;

    private DeviceMasterObjInfoDto deviceMasterObjInfoDto;


    public AniObjectMessage() {
        super(MessageType.OBJECT_MESSAGE);
    }

    public AniObjectMessage(Long objectId, String description, Type objMsgType, DeviceMasterObjInfoDto deviceMasterObjInfoDto, Long userId) {
        super(MessageType.OBJECT_MESSAGE);
        this.objectId = objectId;
        this.description = description;
        this.objMsgType = objMsgType;
        this.deviceMasterObjInfoDto = deviceMasterObjInfoDto;
        this.userId = userId;
    }

    public AniObjectMessage(ResultCode resultCode, String msg, Long objectId, String description, Type objMsgType, DeviceMasterObjInfoDto deviceMasterObjInfoDto) {
        super(resultCode, msg, MessageType.OBJECT_MESSAGE);
        this.objectId = objectId;
        this.description = description;
        this.objMsgType = objMsgType;
        this.deviceMasterObjInfoDto = deviceMasterObjInfoDto;
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


    public DeviceMasterObjInfoDto getDeviceMasterObjInfoDto() {
        return deviceMasterObjInfoDto;
    }

    public void setDeviceMasterObjInfoDto(DeviceMasterObjInfoDto deviceMasterObjInfoDto) {
        this.deviceMasterObjInfoDto = deviceMasterObjInfoDto;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "AniObjectMessage{" +
                "objectId=" + objectId +
                ", description='" + description + '\'' +
                ", objMsgType=" + objMsgType +
                ", deviceMasterObjInfoDto=" + deviceMasterObjInfoDto +
                '}';
    }
}
