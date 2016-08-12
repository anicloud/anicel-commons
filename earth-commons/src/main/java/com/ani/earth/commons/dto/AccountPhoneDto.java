package com.ani.earth.commons.dto;

import java.io.Serializable;

/**
 * Created by hey on 16-8-11.
 */
public class AccountPhoneDto implements Serializable {
    private static final long serialVersionUID = -306109377367113278L;

    public Long id;
    public NationalcodeEnum region;
    public String phoneNumber;

    public AccountPhoneDto() {
    }

    public AccountPhoneDto(Long id, NationalcodeEnum region, String phoneNumber) {
        this.id = id;
        this.region = region;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "AccountPhoneDto{" +
                "id=" + id +
                ", region=" + region +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
