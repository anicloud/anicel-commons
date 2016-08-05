package com.ani.bus.service.commons.dto;

import com.ani.bus.service.commons.dto.aniservice.LanguageEnum;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by hey on 16-8-4.
 */
public class TestDto implements Serializable{

    String a  ="a";
    String b = "b";
    double c = 1.2;
    Long d = 2L;
    Date e ;
    List<String> f;
    Set<LanguageEnum> g;
    public TestDto() {
    }

    public String getA() {
        return a;
    }

    public TestDto(String a, String b, double c, Long d, Date e, List<String> f, Set<LanguageEnum> g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }



    public TestDto(String a, String b, double c, Long d, Date e, List<String> f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public TestDto(String a, String b, double c, Long d, Date e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public TestDto(String a, String b, double c, Long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public TestDto(String a, String b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "TestDto{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
