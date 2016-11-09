package com.ani.octopus.commons.object.dto.message.account;

import com.ani.octopus.commons.object.dto.message.ObjectMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by huangbin on 1/20/16.
 */
public class AccountGroupRemoveMessage extends ObjectMessage {
    public Long groupId;

    public AccountGroupRemoveMessage(String description, ObjectQueryDto src, Long groupId) {
        super(Type.ACCOUNT_GROUP_REMOVED, description, src);
        this.groupId = groupId;
    }
}
