package com.ani.octopus.commons.state.dto;

import java.util.List;

/**
 * Created by yeh on 17-3-17.
 */
public class StateNodeDto {

    public StateDto state;

    public List propsValue;

    public StateNodeDto() {}

    public StateNodeDto(StateDto state, List propsValue) {
        this.state = state;
        this.propsValue = propsValue;
    }

    public boolean equals(Object obj){
        StateNodeDto cmpNode = (StateNodeDto)obj;
        if(!this.state.isLegal() || !cmpNode.state.isLegal()) return false;
        return this.state.equals(cmpNode.state);
    }
}
