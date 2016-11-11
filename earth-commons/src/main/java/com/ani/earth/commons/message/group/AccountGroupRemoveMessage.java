package com.ani.earth.commons.message.group;

import com.ani.earth.commons.message.AccountGroupMessage;
import com.ani.octopus.commons.dto.object.ObjectQueryDto;
import com.ani.octopus.commons.message.object.Type;

/**
 * Created by huangbin on 1/20/16.
 */
public class AccountGroupRemoveMessage extends AccountGroupMessage {

    public AccountGroupRemoveMessage(String description, ObjectQueryDto src, Long groupId) {
        super(Type.ACCOUNT_GROUP_REMOVED, description, src ,groupId);
    }
}
