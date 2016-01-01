package com.anicel.commons.service.bus.message.callmessage;

import com.anicel.commons.service.bus.dto.anistub.AniStub;
import com.anicel.commons.service.bus.dto.anistub.AniStubConnType;
import com.anicel.commons.service.bus.message.MessageType;
import com.anicel.commons.service.bus.message.SocketMessage;

/**
 * Created by zhaoyu on 15-10-30.
 */
public class AniObjectCallMessage extends SocketMessage {

    private AniStub aniStub;
    private AniStubConnType connType;

    public AniObjectCallMessage() {
        super();
    }

    public AniObjectCallMessage(AniStub aniStub, AniStubConnType connType) {
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

    public AniStubConnType getConnType() {
        return connType;
    }

    public void setConnType(AniStubConnType connType) {
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
