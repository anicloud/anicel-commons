package com.ani.octopus.commons.accout.message;

import com.ani.octopus.commons.accout.dto.AccountDto;
import com.ani.octopus.commons.core.message.OctopusHttpMessage;

/**
 * Created by zhaoyu on 15-12-9.
 */
public class AccountHttpMessage extends OctopusHttpMessage<AccountDto> {
    public AccountHttpMessage() {
    }

    public AccountHttpMessage(AccountDto returnObj) {
        super(returnObj);
    }

    public AccountHttpMessage(ResultCode resultCode, String msg, AccountDto returnObj) {
        super(resultCode, msg, returnObj);
    }
}
