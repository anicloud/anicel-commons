package com.ani.bus.service.commons.dto.privilege;

import com.ani.octopus.commons.stub.enumeration.PrivilegeType;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by wyf on 16-9-12.
 */
public class PrivilegeGrantDiffDto implements Serializable {
    private static final long serialVersionUID = 5865090716033319530L;

    public Long accountId;
    public List<Long> objects;
    public Long accountGroupId;
    public List<Set<PrivilegeType>> privileges;

    public PrivilegeGrantDiffDto() {
    }

    public PrivilegeGrantDiffDto(Long accountId, List<Long> objects, Long accountGroupId,
                                 List<Set<PrivilegeType>> privileges) {
        this.accountId = accountId;
        this.objects = objects;
        this.accountGroupId = accountGroupId;
        this.privileges = privileges;
    }

    @Override
    public String toString(){
        return "PrivilegeGrantDiffDto{" +
                "accountId='" + accountId + '\'' +
                ", objects='" + objects.toString() + '\'' +
                ", accountGroupId='" + accountGroupId + '\'' +
                ", privileges='" + privileges.toString() +
                '}';
    }
}
