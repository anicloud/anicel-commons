package com.ani.bus.service.commons.dto.aniservice;

import java.io.Serializable;

/**
 * Created by zsl on 16-8-15.
 */
public class VerificationCodeDto implements Serializable {
    public String code;
    public String phone;

    public VerificationCodeDto() {
    }

    public VerificationCodeDto(String code, String phone) {
        this.code = code;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "VerificationCodeDto{" +
                "code="+code+
                ",phone="+phone+"}";
    }
}
