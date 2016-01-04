package com.ani.octopus.commons.accout.message;

import com.ani.octopus.commons.accout.dto.AccountGroupDto;
import com.ani.octopus.commons.core.message.HttpMessage;
import com.ani.octopus.commons.core.message.Message;

/**
 * Created by zhaoyu on 15-12-10.
 */
public class AccountGroupHttpMessage extends HttpMessage<AccountGroupDto> {
    public AccountGroupHttpMessage() {
    }

    public AccountGroupHttpMessage(AccountGroupDto returnObj) {
        super(returnObj);
    }

    public AccountGroupHttpMessage(Message.ResultCode resultCode, String msg, AccountGroupDto returnObj) {
        super(resultCode, msg, returnObj);
    }
}
