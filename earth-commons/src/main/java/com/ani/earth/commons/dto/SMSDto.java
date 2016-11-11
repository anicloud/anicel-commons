package com.ani.earth.commons.dto;

import com.ani.earth.commons.enumeration.SmsType;

import java.io.Serializable;
/**
 * Created by hey on 16-8-12.
 */
public class SMSDto implements Serializable{

    public String phoneNumber;

    public Enum<SmsType> type;

    public String theme;

    public String serviceName;

    public SMSDto() {
    }

    public SMSDto(String phoneNumber, Enum<SmsType> type, String theme, String serviceName) {
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.theme = theme;
        this.serviceName = serviceName;
    }

}
