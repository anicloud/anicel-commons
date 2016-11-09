package com.ani.octopus.commons.object.dto.message.account;

import com.ani.octopus.commons.object.dto.message.ObjectMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by huangbin on 1/20/16.
 */
public class AccountGroupJoinMessage extends ObjectMessage {
    public Long groupId;
    public Long accountId;

    public AccountGroupJoinMessage(String description, ObjectQueryDto src, Long groupId, Long accountId) {
        super(Type.ACCOUNT_GROUP_JOINED, description, src);
        this.groupId = groupId;
        this.accountId = accountId;
    }
}
