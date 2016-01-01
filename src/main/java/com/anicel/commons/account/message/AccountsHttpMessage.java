package com.anicel.commons.account.message;

import com.anicel.commons.account.dto.AccountDto;
import com.anicel.commons.message.HttpMessage;

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

    public AccountsHttpMessage(ResultCode resultCode, String msg, Set<AccountDto> returnObj) {
        super(resultCode, msg, returnObj);
    }
}
