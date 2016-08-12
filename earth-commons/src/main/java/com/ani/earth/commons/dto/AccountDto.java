package com.ani.earth.commons.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * Created by zhaoyu on 15-10-16.
 */
public class AccountDto implements Serializable {
    private static final long serialVersionUID = 4052752760162801947L;

    public Long accountId;
    public String screenName;
    public String email;
    @JsonIgnore
    public String password;
    public boolean enabled;
    public Long registerDate;
    public AccountType accountType;

    public boolean accountNonExpired;
    public boolean accountNonLocked;
    public boolean credentialsNonExpired;

    public AccountInfoDto accountInfo;
    public AccountPhoneDto accountPhoneDto;
    public Set<AccountGroupDto> groupSet;

    public AccountDto() {
    }

    public AccountDto(Long accountId) {
        this.accountId = accountId;
    }

    public AccountDto(Long accountId, String screenName, String email, String password,
                      AccountType accountType,AccountPhoneDto accountPhoneDto,AccountInfoDto accountInfo) {
        this.accountId = accountId;
        this.screenName = screenName;
        this.email = email;
        this.password = password;
        this.accountType = accountType;
        this.accountPhoneDto = accountPhoneDto;
        this.accountInfo = accountInfo;
    }

    public AccountDto(Long accountId, String screenName, String email, String password,
                      boolean enabled, Long registerDate, AccountType accountType,
                      boolean accountNonExpired, boolean accountNonLocked,
                      boolean credentialsNonExpired, AccountInfoDto accountInfo,
                      AccountPhoneDto accountPhoneDto,
                      Set<AccountGroupDto> groupSet) {
        this.accountId = accountId;
        this.screenName = screenName;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.registerDate = registerDate;
        this.accountType = accountType;
        this.accountNonExpired = accountNonExpired;
        this.accountNonLocked = accountNonLocked;
        this.credentialsNonExpired = credentialsNonExpired;
        this.accountInfo = accountInfo;
        this.accountPhoneDto = accountPhoneDto;
        this.groupSet = groupSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountDto that = (AccountDto) o;
        return Objects.equals(accountId, that.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId);
    }

    @Override
    public String toString() {
        return "AccountDto{" +
                "accountId=" + accountId +
                ", screenName='" + screenName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", registerDate=" + registerDate +
                ", accountType=" + accountType +
                ", accountNonExpired=" + accountNonExpired +
                ", accountNonLocked=" + accountNonLocked +
                ", credentialsNonExpired=" + credentialsNonExpired +
                ", accountInfo=" + accountInfo +
                ", accountPhoneDto=" + accountPhoneDto +
                ", groupSet=" + groupSet +
                '}';
    }
}
