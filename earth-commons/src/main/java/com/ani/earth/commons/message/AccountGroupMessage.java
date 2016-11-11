package com.ani.earth.commons.message;

import com.ani.octopus.commons.dto.object.ObjectQueryDto;
import com.ani.octopus.commons.message.object.ObjectMessage;
import com.ani.octopus.commons.message.object.Type;

/**
 * Created by hey on 16-11-10.
 */
public class AccountGroupMessage extends ObjectMessage {
    public Long groupId;
    public AccountGroupMessage(Type type, String description, ObjectQueryDto src , Long groupId) {
        super(type, description, src);
        this.groupId = groupId;
    }
}
