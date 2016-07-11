package com.ani.earth.commons.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by zhaoyu on 15-11-11.
 */
public class GroupFormDto implements Serializable {
    private static final long serialVersionUID = -2997915395832489663L;

    public Long groupId;
    @NotNull
    @Size(min = 1, max = 100)
    public String groupName;
    @NotNull
    public GroupType groupType;
    @NotNull
    public Long accountId;

    public GroupFormDto() {
    }

    public GroupFormDto(String groupName, GroupType groupType, Long accountId) {
        this(null, groupName, groupType, accountId);
    }

    public GroupFormDto(Long groupId, String groupName, GroupType groupType, Long accountId) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupType = groupType;
        this.accountId = accountId;
    }

    public static AccountGroupDto toAccountGroupDto(GroupFormDto formDto) {
        if (formDto == null) {
            return null;
        }
        return new AccountGroupDto(
                formDto.groupId,
                formDto.groupName,
                formDto.groupType,
                new AccountDto(formDto.accountId),
                null
        );
    }

}
