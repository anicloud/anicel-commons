package com.ani.earth.commons.message.group;

import com.ani.earth.commons.message.AccountGroupMessage;
import com.ani.octopus.commons.message.object.Type;
import com.ani.octopus.commons.dto.object.ObjectQueryDto;

/**
 * Created by huangbin on 1/20/16.
 */
public class AccountGroupJoinMessage extends AccountGroupMessage {
    public Long accountId;

    public AccountGroupJoinMessage(String description, ObjectQueryDto src, Long groupId, Long accountId) {
        super(Type.ACCOUNT_GROUP_JOINED, description, src ,groupId);
        this.accountId = accountId;
    }
}
