package com.ani.octopus.commons.object.dto.object.privilege;

import com.ani.utils.core.datatype.PrivilegeType;
import com.ani.utils.dto.AniDto;
import com.ani.utils.dto.AniRequiredField;

import java.util.Set;

/**
 * Created by yeh on 15-12-3.
 */
public class ObjectPrivilegeGrantDto extends AniDto {

    @AniRequiredField
    public Long accountGroupId;

    @AniRequiredField
    public Set<PrivilegeType> privileges;

    public ObjectPrivilegeGrantDto() {
        super();
    }

    public ObjectPrivilegeGrantDto(Long accountGroupId, Set<PrivilegeType> privileges) {
        super();
        this.accountGroupId = accountGroupId;
        this.privileges = privileges;
    }
}
