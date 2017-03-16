package com.ani.octopus.commons.object.enumeration;

/**
 * Created by hey on 17-3-14.
 */
public enum StateMachineMessageTypes {
    STATE_TRANSFER,
    STATE_TRANSFER_WARNING,
    STATE_ARGUMENT_UPDATE,
    STATE_ARGUMENT_ERROR;

    public static StateMachineMessageTypes[] values = StateMachineMessageTypes.values();

    public byte getStateByte() {
        return (byte) this.ordinal();
    }

    public byte[] getStateByteArr() {
        return new byte[]{getStateByte()};
    }
}
