package com.ani.earth.commons.message;

import com.ani.earth.commons.dto.AccountGroupDto;
import com.ani.octopus.commons.message.OctopusHttpMessage;
import com.ani.octopus.commons.message.OctopusMessage;

/**
 * Created by zhaoyu on 15-12-10.
 */
public class AccountGroupHttpMessage extends OctopusHttpMessage<AccountGroupDto> {
    public AccountGroupHttpMessage() {
    }

    public AccountGroupHttpMessage(AccountGroupDto returnObj) {
        super(returnObj);
    }

    public AccountGroupHttpMessage(OctopusMessage.ResultCode resultCode, String msg, AccountGroupDto returnObj) {
        super(resultCode, msg, returnObj);
    }
}
