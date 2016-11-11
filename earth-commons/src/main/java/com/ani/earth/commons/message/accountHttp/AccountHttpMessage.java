package com.ani.earth.commons.message.accountHttp;

import com.ani.earth.commons.dto.AccountDto;
import com.ani.octopus.commons.message.http.HttpMessage;
import com.ani.octopus.commons.message.http.Message;

/**
 * Created by zhaoyu on 15-12-9.
 */
public class AccountHttpMessage extends HttpMessage<AccountDto> {
    public AccountHttpMessage() {
    }

    public AccountHttpMessage(AccountDto returnObj) {
        super(returnObj);
    }

    public AccountHttpMessage(Message.ResultCode resultCode, String msg, AccountDto returnObj) {
        super(resultCode, msg, returnObj);
    }
}
