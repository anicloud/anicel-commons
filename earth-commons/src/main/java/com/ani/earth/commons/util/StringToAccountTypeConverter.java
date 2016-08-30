package com.ani.earth.commons.util;

import com.ani.earth.commons.dto.AccountType;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

/**
 * Created by hey on 16-8-29.
 */
public class StringToAccountTypeConverter implements Converter<String ,AccountType> {



    @Override
    public AccountType convert(String source) {
        String value = source.trim();
        if ("".equals(value)) {
            return null;
        }
        return AccountType.get(Integer.parseInt(source));
    }

    @Override
    public JavaType getInputType(TypeFactory typeFactory) {
        return null;
    }

    @Override
    public JavaType getOutputType(TypeFactory typeFactory) {
        return null;
    }


}
