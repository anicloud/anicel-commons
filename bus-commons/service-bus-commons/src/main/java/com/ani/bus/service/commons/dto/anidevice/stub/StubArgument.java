package com.ani.bus.service.commons.dto.anidevice.stub;

import com.ani.octopus.commons.stub.type.*;

import java.io.Serializable;

/**
 * @autor zhaoyu
 * @date 16-3-7
 * @since JDK 1.7
 */
public class StubArgument<T> implements Serializable {
    private static final long serialVersionUID = 2380569542561491376L;

    public String name;
    public T argumentType;

    public StubArgument() {
    }

    public StubArgument(String name, T argumentType) {
        this.name = name;
        this.argumentType = argumentType;
    }

    @Override
    public String toString() {
        return "StubArgument{" +
                "name='" + name + '\'' +
                '}';
    }
}
