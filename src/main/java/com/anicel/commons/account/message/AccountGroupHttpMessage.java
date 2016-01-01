package com.anicel.commons.account.message;

import com.anicel.commons.account.dto.AccountGroupDto;
import com.anicel.commons.message.HttpMessage;
import com.anicel.commons.message.Message;

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
