package com.ani.octopus.commons.message.object;


import com.ani.octopus.commons.dto.object.ObjectQueryDto;

import java.io.Serializable;

/**
 * Created by huangbin on 12/23/15.
 */
public class ObjectMessage implements Serializable {
    public Type type;
    public String description;
    public ObjectQueryDto src;



    public ObjectMessage(Type type, String description, ObjectQueryDto src) {
        this.type = type;
        this.description = description;
        this.src = src;
    }
}
