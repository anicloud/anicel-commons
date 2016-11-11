package com.ani.earth.commons.enumeration;

/**
 * Created by hey on 16-8-11.
 */
public enum NationalcodeEnum {
    USA("U.S.A", 1),

    HK("HongKong",852),
    CHN("China", 86),
    TW("TaiWan",886);


    private String nation;
    private int code;

    NationalcodeEnum(String nation, int code) {
        this.nation = nation;
        this.code = code;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
