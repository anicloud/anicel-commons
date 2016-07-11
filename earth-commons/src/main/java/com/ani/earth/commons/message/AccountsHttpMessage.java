package com.ani.earth.commons.message;

import com.ani.earth.commons.dto.AccountDto;
import com.ani.octopus.commons.message.OctopusHttpMessage;
import com.ani.octopus.commons.message.OctopusMessage;

import java.util.Set;

/**
 * Created by zhaoyu on 15-12-10.
 */
public class AccountsHttpMessage extends OctopusHttpMessage<Set<AccountDto>> {
    public AccountsHttpMessage() {
    }

    public AccountsHttpMessage(Set<AccountDto> returnObj) {
        super(returnObj);
    }

    public AccountsHttpMessage(OctopusMessage.ResultCode resultCode, String msg, Set<AccountDto> returnObj) {
        super(resultCode, msg, returnObj);
    }
}
