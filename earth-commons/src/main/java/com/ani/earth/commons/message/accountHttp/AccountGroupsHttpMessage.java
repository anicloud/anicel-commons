package com.ani.earth.commons.message.accountHttp;

import com.ani.earth.commons.dto.AccountGroupDto;
import com.ani.octopus.commons.message.http.HttpMessage;
import com.ani.octopus.commons.message.http.Message;

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
