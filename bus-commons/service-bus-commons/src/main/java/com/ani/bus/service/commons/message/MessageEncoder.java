package com.ani.bus.service.commons.message;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

/**
 * Created by zhaoyu on 15-10-29.
 */
public class MessageEncoder implements Encoder.Text<SocketMessage> {

    private ObjectMapper objectMapper;

    public MessageEncoder() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public String encode(SocketMessage commandMessage) throws EncodeException {
        String result = null;
        try {
            result = objectMapper.writeValueAsString(commandMessage);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}
