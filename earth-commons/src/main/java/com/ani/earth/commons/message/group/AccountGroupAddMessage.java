package com.ani.earth.commons.message.group;

import com.ani.earth.commons.message.AccountGroupMessage;
import com.ani.octopus.commons.dto.object.ObjectQueryDto;
import com.ani.octopus.commons.message.object.Type;

/**
 * Created by huangbin on 1/20/16.
 */
public class AccountGroupAddMessage extends AccountGroupMessage {

    public AccountGroupAddMessage(String description, ObjectQueryDto src, Long groupId) {
        super(Type.ACCOUNT_GROUP_ADDED, description, src,groupId);
    }
}
