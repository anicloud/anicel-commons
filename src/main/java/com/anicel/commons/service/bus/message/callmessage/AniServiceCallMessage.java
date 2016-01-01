package com.anicel.commons.service.bus.message.callmessage;

import com.anicel.commons.service.bus.dto.anistub.AniStub;
import com.anicel.commons.service.bus.message.MessageType;
import com.anicel.commons.service.bus.message.SocketMessage;

/**
 * Created by zhaoyu on 15-10-30.
 */
public class AniServiceCallMessage extends SocketMessage {

    private AniStub aniStub;

    public AniServiceCallMessage() {
        super();
    }

    public AniServiceCallMessage(AniStub aniStub) {
        super(MessageType.CALL_ANI_SERVICE);
        this.aniStub = aniStub;
    }

    public AniStub getAniStub() {
        return aniStub;
    }

    public void setAniStub(AniStub aniStub) {
        this.aniStub = aniStub;
    }

    @Override
    public String toString() {
        return "AniServiceCallMessage{" +
                "aniStub=" + aniStub +
                "} " + super.toString();
    }
}
