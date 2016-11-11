package com.ani.earth.commons.message.accountHttp;

import com.ani.earth.commons.dto.AccountDto;
import com.ani.octopus.commons.message.http.HttpMessage;
import com.ani.octopus.commons.message.http.Message;

import java.util.Set;

/**
 * Created by zhaoyu on 15-12-10.
 */
public class AccountsHttpMessage extends HttpMessage<Set<AccountDto>> {
    public AccountsHttpMessage() {
    }

    public AccountsHttpMessage(Set<AccountDto> returnObj) {
        super(returnObj);
    }

    public AccountsHttpMessage(Message.ResultCode resultCode, String msg, Set<AccountDto> returnObj) {
        super(resultCode, msg, returnObj);
    }
}
