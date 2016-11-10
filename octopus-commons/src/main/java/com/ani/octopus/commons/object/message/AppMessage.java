package com.ani.octopus.commons.object.message;

import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by hey on 16-11-10.
 */
public class AppMessage extends ObjectMessage {
    public Long appId;
    public Long accountId;
    public AppMessage(Type type, String description, ObjectQueryDto src,Long appId,Long accountId) {
        super(type, description, src);
        this.appId = appId;
        this.accountId = accountId;
    }
}
