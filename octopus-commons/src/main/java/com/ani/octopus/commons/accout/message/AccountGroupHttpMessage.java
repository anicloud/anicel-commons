package com.ani.octopus.commons.accout.message;

import com.ani.octopus.commons.accout.dto.AccountGroupDto;
import com.ani.octopus.commons.core.message.OctopusHttpMessage;
import com.ani.octopus.commons.core.message.OctopusMessage;

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
