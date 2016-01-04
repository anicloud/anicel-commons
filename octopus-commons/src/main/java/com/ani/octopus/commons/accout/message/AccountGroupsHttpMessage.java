package com.ani.octopus.commons.accout.message;

import com.ani.octopus.commons.accout.dto.AccountGroupDto;
import com.ani.octopus.commons.core.message.HttpMessage;
import com.ani.octopus.commons.core.message.Message;

import java.util.List;

/**
 * Created by zhaoyu on 15-12-10.
 */
public class AccountGroupsHttpMessage extends HttpMessage<List<AccountGroupDto>> {
    public AccountGroupsHttpMessage() {
    }

    public AccountGroupsHttpMessage(List<AccountGroupDto> returnObj) {
        super(returnObj);
    }

    public AccountGroupsHttpMessage(Message.ResultCode resultCode, String msg, List<AccountGroupDto> returnObj) {
        super(resultCode, msg, returnObj);
    }
}
