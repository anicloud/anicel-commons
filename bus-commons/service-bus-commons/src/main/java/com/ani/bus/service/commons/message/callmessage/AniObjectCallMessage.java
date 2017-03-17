package com.ani.bus.service.commons.message.callmessage;

import com.ani.bus.service.commons.dto.anistub.AniStub;
import com.ani.bus.service.commons.message.MessageType;
import com.ani.bus.service.commons.message.SocketMessage;
import com.ani.utils.core.datatype.ConnType;

/**
 * Created by zhaoyu on 15-10-30.
 */
public class AniObjectCallMessage extends SocketMessage {

    private AniStub aniStub;

    private ConnType connType;

    public AniObjectCallMessage() {
        super();
    }

    public AniObjectCallMessage(AniStub aniStub, ConnType connType) {
        super(MessageType.CALL_ANI_OBJECT);
        this.aniStub = aniStub;
        this.connType = connType;
    }

    public AniStub getAniStub() {
        return aniStub;
    }

    public void setAniStub(AniStub aniStub) {
        this.aniStub = aniStub;
    }

    public ConnType getConnType() {
        return connType;
    }

    public void setConnType(ConnType connType) {
        this.connType = connType;
    }

    @Override
    public String toString() {
        return "AniObjectCallMessage{" +
                "aniStub=" + aniStub +
                ", connType=" + connType +
                "} " + super.toString();
    }
}
