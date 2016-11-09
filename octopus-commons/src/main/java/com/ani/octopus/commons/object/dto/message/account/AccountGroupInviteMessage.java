package com.ani.octopus.commons.object.dto.message.account;


import com.ani.octopus.commons.object.dto.message.ObjectMessage;
import com.ani.octopus.commons.object.dto.object.ObjectQueryDto;

/**
 * Created by huangbin on 1/20/16.
 */
public class AccountGroupInviteMessage extends ObjectMessage {
    public Long groupId;
    public Long accountId;

    public AccountGroupInviteMessage(String description, ObjectQueryDto src, Long groupId, Long accountId) {
        super(Type.ACCOUNT_GROUP_INVITED, description, src);
        this.groupId = groupId;
        this.accountId = accountId;
    }
}
