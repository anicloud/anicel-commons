package com.ani.octopus.commons.accout.dto;

import java.io.Serializable;

/**
 * @autor zhaoyu
 * @date 15-12-22
 * @since JDK 1.7
 */
public class ContactDto implements Serializable {
    private static final long serialVersionUID = 5496456223326855989L;

    public Long accountId;

    public ContactDto(Long accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "ContactDto{" +
                "accountId=" + accountId +
                '}';
    }
}
