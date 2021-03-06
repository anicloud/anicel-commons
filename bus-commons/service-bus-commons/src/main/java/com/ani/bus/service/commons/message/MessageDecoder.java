package com.ani.bus.service.commons.message;

import com.ani.bus.service.commons.message.callmessage.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
import java.io.IOException;

/**
 * Created by zhaoyu on 15-10-29.
 */
public class MessageDecoder implements Decoder.Text<SocketMessage> {

    private ObjectMapper objectMapper;

    public MessageDecoder() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public SocketMessage decode(String s) throws DecodeException {
        // determine from s to the Message kind
        SocketMessage message = null;
        try {
            if (s != null && s.contains(MessageType.CALL_ANI_OBJECT.toString())) {
                message = objectMapper.readValue(s, AniObjectCallMessage.class);
            }
            if (s != null && s.contains(MessageType.CALL_ANI_ACCOUNT.toString())) {
                message = objectMapper.readValue(s, AniAccountCallMessage.class);
            }
            if (s != null && s.contains(MessageType.CALL_ANI_SERVICE.toString())) {
                message = objectMapper.readValue(s, AniServiceCallMessage.class);
            }
            if (s != null && s.contains(MessageType.OBJECT_MESSAGE.toString())) {
                message = objectMapper.readValue(s, AniObjectMessage.class);
            }
            if(s != null && s.contains((MessageType.OBJECT_STATE_MESSAGE.toString()))) {
                message = objectMapper.readValue(s, AniStateObjectMessage.class);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return message;
    }

    @Override
    public boolean willDecode(String s) {
        // determine if the message can be converted into a message
        return true;
    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}
