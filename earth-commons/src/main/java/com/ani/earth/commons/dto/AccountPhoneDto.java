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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NationalcodeEnum getRegion() {
        return region;
    }

    public void setRegion(NationalcodeEnum region) {
        this.region = region;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
