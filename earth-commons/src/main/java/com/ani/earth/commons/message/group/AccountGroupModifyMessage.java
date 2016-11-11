package com.ani.earth.commons.message.group;

import com.ani.earth.commons.message.AccountGroupMessage;
import com.ani.octopus.commons.dto.object.ObjectQueryDto;
import com.ani.octopus.commons.message.object.Type;

/**
 * Created by huangbin on 1/20/16.
 */
public class AccountGroupModifyMessage extends AccountGroupMessage {

    public AccountGroupModifyMessage(String description, ObjectQueryDto src, Long groupId) {
        super(Type.ACCOUNT_GROUP_MODIFIED, description, src ,groupId);
    }
}
