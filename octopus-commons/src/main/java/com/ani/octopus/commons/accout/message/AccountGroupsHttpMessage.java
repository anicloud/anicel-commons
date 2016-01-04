package com.ani.octopus.commons.accout.message;

import com.ani.octopus.commons.accout.dto.AccountGroupDto;
import com.ani.octopus.commons.core.message.OctopusHttpMessage;
import com.ani.octopus.commons.core.message.OctopusMessage;

import java.util.List;

/**
 * Created by zhaoyu on 15-12-10.
 */
public class AccountGroupsHttpMessage extends OctopusHttpMessage<List<AccountGroupDto>> {
    public AccountGroupsHttpMessage() {
    }

    public AccountGroupsHttpMessage(List<AccountGroupDto> returnObj) {
        super(returnObj);
    }

    public AccountGroupsHttpMessage(OctopusMessage.ResultCode resultCode, String msg, List<AccountGroupDto> returnObj) {
        super(resultCode, msg, returnObj);
    }
}
