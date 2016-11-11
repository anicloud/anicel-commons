package com.ani.earth.commons.message.accountHttp;

import com.ani.earth.commons.dto.AccountGroupDto;
import com.ani.octopus.commons.message.http.HttpMessage;
import com.ani.octopus.commons.message.http.Message;

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
