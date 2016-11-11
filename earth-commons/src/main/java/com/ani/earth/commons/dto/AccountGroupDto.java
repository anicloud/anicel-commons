package com.ani.earth.commons.dto;

import com.ani.earth.commons.enumeration.GroupType;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * Created by zhaoyu on 15-10-16.
 */
public class AccountGroupDto implements Serializable {
    private static final long serialVersionUID = -3084031060158925590L;

    public Long groupId;
    public String groupName;
    public GroupType groupType;

    public AccountDto owner;
    public Set<AccountDto> accounts;

    public AccountGroupDto() {
    }

    public AccountGroupDto(Long groupId, String groupName, GroupType groupType,
                           AccountDto owner, Set<AccountDto> accounts) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupType = groupType;
        this.owner = owner;
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountGroupDto groupDto = (AccountGroupDto) o;
        return Objects.equals(groupId, groupDto.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId);
    }

    @Override
    public String toString() {
        return "AccountGroupDto{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", groupType=" + groupType +
                ", owner=" + owner +
                '}';
    }
}
