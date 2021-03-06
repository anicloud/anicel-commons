package com.ani.octopus.commons.object.enumeration;

/**
 * Created by yeh on 15-10-16.
 */
public enum AniObjectState {
    ACTIVE,
    DISABLE,
    REMOVED;

    public static AniObjectState[] values = AniObjectState.values();

    public byte getStateByte() {
        return (byte) this.ordinal();
    }

    public byte[] getStateByteArr() {
        return new byte[]{
                getStateByte()
        };
    }
}
