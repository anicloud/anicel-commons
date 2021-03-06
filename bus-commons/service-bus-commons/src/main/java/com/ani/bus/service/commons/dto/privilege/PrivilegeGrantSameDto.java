package com.ani.bus.service.commons.dto.privilege;

import com.ani.utils.core.datatype.PrivilegeType;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by wyf on 16-9-12.
 */
public class PrivilegeGrantSameDto implements Serializable {
    private static final long serialVersionUID = -4627180708029858360L;

    @NotNull
    public Long accountId;
    @NotNull
    public List<Long> objects;
    @NotNull
    public Long accountGroupId;
    @NotNull
    public Set<PrivilegeType> privileges;

    public PrivilegeGrantSameDto() {
    }

    public PrivilegeGrantSameDto(Long accountId, List<Long> objects, Long accountGroupId,
                                 Set<PrivilegeType> privileges) {
        this.accountId = accountId;
        this.objects = objects;
        this.accountGroupId = accountGroupId;
        this.privileges = privileges;
    }

    @Override
    public String toString(){
        return "PrivilegeGrantSameDto{" +
                "accountId='" + accountId + '\'' +
                ", objects='" + objects.toString() + '\'' +
                ", accountGroupId='" + accountGroupId + '\'' +
                ", privileges='" + privileges.toString() +
                '}';
    }
}
