package com.ani.earth.commons.message.group;

import com.ani.earth.commons.message.AccountGroupMessage;
import com.ani.octopus.commons.dto.object.ObjectQueryDto;
import com.ani.octopus.commons.message.object.Type;

/**
 * Created by huangbin on 1/20/16.
 */
public class AccountGroupQuitMessage extends AccountGroupMessage {
    public Long accountId;

    public AccountGroupQuitMessage(String description, ObjectQueryDto src, Long groupId, Long accountId) {
        super(Type.ACCOUNT_GROUP_QUIT, description, src ,groupId);
        this.accountId = accountId;
    }
}
