package com.anicel.commons.service.bus.dto.accountobject;

/**
 * Created by zhaoyu on 15-11-14.
 */
public enum AniObjectState {
    ACTIVE,
    DISABLE,
    REMOVED;

    public static AniObjectState[] values = AniObjectState.values();
}
