package com.ani.octopus.commons.object.dto.object.privilege;

import com.ani.earth.commons.dto.AccountGroupDto;
import com.ani.utils.core.datatype.PrivilegeType;

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
