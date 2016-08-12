package com.ani.earth.commons.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by zhaoyu on 15-11-11.
 */
public class AccountRegisterDto implements Serializable {
    private static final long serialVersionUID = -5229370617948473689L;

    @NotNull
    @Size(min = 1, max = 100)
    public String screenName;

    @Size(min = 1, max = 100)
    public String email;
    @NotNull
    @Size(min = 1, max = 100)
    public String password;
    @NotNull
    public AccountType accountType;

    @Size(min = 1, max = 100)
    public AccountPhoneDto accountphoneDto;
    @Size(min = 1, max = 100)
    public String address;
    @Size(min = 1, max = 100)
    public String company;
    @Size(min = 1, max = 200)
    public String photoPath;

    public AccountRegisterDto() {
    }

    public AccountRegisterDto(String screenName, String email, String password,
                              AccountType accountType, AccountPhoneDto accountPhoneDto,
                              String address, String company, String photoPath) {
        this.screenName = screenName;
        this.email = email;
        this.password = password;
        this.accountType = accountType;
        this.accountphoneDto = accountPhoneDto;
        this.address = address;
        this.company = company;
        this.photoPath = photoPath;
    }

    public static AccountDto toAccountDto(AccountRegisterDto registerDto) {
        if (registerDto == null) {
            return null;
        }
        AccountInfoDto accountInfoDto = new AccountInfoDto(
                registerDto.address,
                registerDto.company,
                registerDto.photoPath
        );
        return new AccountDto(
                null,
                registerDto.screenName,
                registerDto.email,
                registerDto.password,
                registerDto.accountType,
                registerDto.accountphoneDto,
                accountInfoDto
        );
    }
}
