package com.ani.earth.commons.message;

import com.ani.earth.commons.dto.AccountDto;
import com.ani.octopus.commons.message.OctopusHttpMessage;
import com.ani.octopus.commons.message.OctopusMessage;

/**
 * Created by zhaoyu on 15-12-9.
 */
public class AccountHttpMessage extends OctopusHttpMessage<AccountDto> {
    public AccountHttpMessage() {
    }

    public AccountHttpMessage(AccountDto returnObj) {
        super(returnObj);
    }

    public AccountHttpMessage(OctopusMessage.ResultCode resultCode, String msg, AccountDto returnObj) {
        super(resultCode, msg, returnObj);
    }
}
