package com.ani.octopus.commons.object.dto.state;

import com.ani.octopus.commons.object.enumeration.AniObjectState;
import com.ani.utils.core.AniByte;

import java.util.Map;

/**
 * Created by hey on 17-3-17.
 */
public class ObjectMainState extends ObjectState {

    public Map<AniByte, AniObjectState> hostsConnState;

    public ObjectMainState() {
    }
}
