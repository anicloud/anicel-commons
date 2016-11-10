package com.ani.octopus.commons.object.dto.message.account;

import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;
import com.ani.octopus.commons.object.message.ObjectMessage;

/**
 * Created by huangbin on 1/20/16.
 */
public class AccountGroupAddMessage extends ObjectMessage {
    public Long groupId;

    public AccountGroupAddMessage(String description, ObjectQueryDto src, Long groupId) {
        super(Type.ACCOUNT_GROUP_ADDED, description, src);
        this.groupId = groupId;
    }
}
