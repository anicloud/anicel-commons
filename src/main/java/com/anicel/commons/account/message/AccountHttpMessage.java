package com.anicel.commons.account.message;

import com.anicel.commons.account.dto.AccountDto;
import com.anicel.commons.message.HttpMessage;

/**
 * Created by zhaoyu on 15-12-9.
 */
public class AccountHttpMessage extends HttpMessage<AccountDto> {
    public AccountHttpMessage() {
    }

    public AccountHttpMessage(AccountDto returnObj) {
        super(returnObj);
    }

    public AccountHttpMessage(ResultCode resultCode, String msg, AccountDto returnObj) {
        super(resultCode, msg, returnObj);
    }
}
