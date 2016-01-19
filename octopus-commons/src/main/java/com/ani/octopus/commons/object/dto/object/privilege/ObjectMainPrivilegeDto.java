package com.ani.octopus.commons.object.dto.object.privilege;

import com.ani.octopus.commons.accout.dto.AccountGroupDto;
import com.ani.octopus.commons.stub.enumeration.PrivilegeType;

/**
 * Created by yeh on 15-12-1.
 */
public class ObjectMainPrivilegeDto extends PrivilegeDto {

    public AccountGroupDto accountGroup;

    public ObjectMainPrivilegeDto() {
        super();
    }

    public ObjectMainPrivilegeDto(AccountGroupDto accountGroup) {
        this.accountGroup = accountGroup;
    }

    public ObjectMainPrivilegeDto(PrivilegeType privilegeType, AccountGroupDto accountGroup) {
        super(privilegeType);
        this.accountGroup = accountGroup;
    }
}