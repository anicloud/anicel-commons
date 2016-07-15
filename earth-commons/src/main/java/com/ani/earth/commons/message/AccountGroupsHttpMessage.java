package com.ani.earth.commons.message;

import com.ani.earth.commons.dto.AccountGroupDto;
import com.ani.octopus.commons.message.OctopusHttpMessage;
import com.ani.octopus.commons.message.OctopusMessage;

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