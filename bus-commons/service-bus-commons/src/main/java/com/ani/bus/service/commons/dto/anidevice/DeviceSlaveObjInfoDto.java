package com.ani.bus.service.commons.dto.anidevice;

import com.ani.bus.service.commons.dto.anidevice.stub.StubMeta;
import com.ani.octopus.commons.object.enumeration.AniObjectState;
import java.io.Serializable;
import java.util.List;

/**
 * @autor zhaoyu
 * @date 16-3-2
 * @since JDK 1.7
 */
public class DeviceSlaveObjInfoDto implements Serializable {
    private static final long serialVersionUID = 6331836053396621328L;

    public String name;
    public String description;
    public AniObjectState state;

    public Integer objectSlaveId;

    public List<StubMeta> stubs;

    public DeviceSlaveObjInfoDto() {
    }

    public DeviceSlaveObjInfoDto(String name, String description, List<StubMeta> stubs,
                                    AniObjectState state, Integer objectSlaveId) {
        this.name = name;
        this.description = description;
        this.state = state;
        this.stubs = stubs;
        this.objectSlaveId = objectSlaveId;
    }
}
