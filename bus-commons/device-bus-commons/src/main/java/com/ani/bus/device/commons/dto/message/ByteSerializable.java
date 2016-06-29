package com.ani.bus.device.commons.dto.message;

import java.io.*;

/**
 * Created by huangbin on 10/19/15.
 */
public interface ByteSerializable extends Serializable {
    void write(DataOutput out) throws IOException;
    void read(DataInput in) throws IOException;
}
