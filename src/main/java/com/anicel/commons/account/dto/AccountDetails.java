package com.anicel.commons.account.dto;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.*;

/**
 * Created by zhaoyu on 15-12-14.
 */
public class AccountDetails implements UserDetails, Serializable {
    private static final long serialVersionUID = 1994091075635054910L;

    public Long id;
    @NotNull
    public Long accountId;
    @NotNull
    @Size(min = 3, max = 100)
    public String screenName;
    @NotNull
    @Size(min = 6, max = 100)
    public String email;
    @NotNull
    @Size(min = 6, max = 100)
    private String password;
    @NotNull
    public boolean enabled;
    @NotNull
    public Date registerDate;
    @NotNull
    public AccountType accountType;

    @NotNull
    public boolean accountNonExpired;
    @NotNull
    public boolean accountNonLocked;
    @NotNull
    public boolean credentialsNonExpired;

    @Valid
    public AccountInfoDto accountInfo;
    public Set<GrantedAuthority> authoritySet;  // groups that this account in

    public AccountDetails() {
    }

    public AccountDetails(Long id, Long accountId) {
        this.id = id;
        this.accountId = accountId;
    }

    public AccountDetails(Long id, Long accountId, String screenName, String email,
                          String password, boolean enabled, Date registerDate,
                          AccountType accountType, boolean accountNonExpired,
                          boolean accountNonLocked, boolean credentialsNonExpired,
                          AccountInfoDto accountInfo, Set<GrantedAuthority> authoritySet) {
        this.id = id;
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
        this.authoritySet = authoritySet;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authoritySet;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return this.accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountDetails that = (AccountDetails) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(accountId, that.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountId);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountId='" + accountId + '\'' +
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
                "} " + super.toString();
    }

    public static Set<GrantedAuthority> loadUserAuthorities(Set<AccountGroupDto> groupSet) {
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        for (AccountGroupDto sysGroup : groupSet) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(sysGroup.groupName);
            authorities.add(grantedAuthority);
        }
        return authorities;
    }
}
