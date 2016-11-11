package com.ani.earth.commons.enumeration;

/**
 * Created by zhaoyu on 15-10-20.
 */
public enum AccountType {
    //ROOT, PERSONAL, ORGANIZATIONAL;

    ROOT("0"),
    PERSONAL("1"),
    ORGANIZATIONAL("2");

    private final String value;

    private AccountType(String v) {
        this.value = v;
    }

    public String toString() {
        return this.value;
    }

    public static AccountType get(int v) {
        String str = String.valueOf(v);
        return get(str);
    }

    public static AccountType get(String str) {
        for (AccountType a : values()) {
            if(a.toString().equals(str)) {
                return a;
            }
        }
        return null;
    }
}
