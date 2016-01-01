package com.anicel.commons.account.message;

import com.anicel.commons.account.dto.AccountGroupDto;
import com.anicel.commons.message.HttpMessage;
import com.anicel.commons.message.Message;

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
