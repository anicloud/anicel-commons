package com.ani.octopus.commons.object.dto.object.privilege;

import com.ani.utils.core.datatype.PrivilegeType;
import com.ani.utils.dto.AniDto;

/**
 * Created by yeh on 15-12-1.
 */
public abstract class PrivilegeDto extends AniDto {
    public PrivilegeType privilegeType;

    public PrivilegeDto() {}

    public PrivilegeDto(PrivilegeType privilegeType) {
        this.privilegeType = privilegeType;
    }
}
