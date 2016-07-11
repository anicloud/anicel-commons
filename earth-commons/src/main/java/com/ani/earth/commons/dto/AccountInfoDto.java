package com.ani.earth.commons.dto;

import java.io.Serializable;

/**
 * Created by zhaoyu on 15-10-19.
 */
public class AccountInfoDto implements Serializable {
    private static final long serialVersionUID = 8160120708096274327L;

    public Long id;
    public String phoneNumber;
    public String address;
    public String company;
    public String photoPath;

    public AccountInfoDto() {
        super();
    }

    public AccountInfoDto(String phoneNumber, String address, String company, String photoPath) {
        this(null, phoneNumber, address, company, photoPath);
    }

    public AccountInfoDto(Long id, String phoneNumber, String address, String company, String photoPath) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.company = company;
        this.photoPath = photoPath;
    }

    @Override
    public String toString() {
        return "AccountInfoDto{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", company='" + company + '\'' +
                ", photoPath='" + photoPath + '\'' +
                "} " + super.toString();
    }
}
