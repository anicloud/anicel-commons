package com.ani.bus.service.commons.dto.anidevice;

import com.ani.octopus.commons.object.dto.object.ObjectSlaveInfoDto;
import com.ani.octopus.commons.object.enumeration.AniObjectState;
import com.ani.octopus.commons.object.enumeration.DataState;
import com.ani.octopus.commons.stub.dto.StubDto;

import java.util.List;

/**
 * @autor zhaoyu
 * @date 16-3-2
 * @since JDK 1.7
 */
public class DeviceSlaveObjInfoDto extends ObjectSlaveInfoDto {
    private static final long serialVersionUID = 6331836053396621328L;

    public String name;
    public String description;

    public DeviceSlaveObjInfoDto() {
    }

    public DeviceSlaveObjInfoDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public DeviceSlaveObjInfoDto(String name, String description, List<StubDto> stubs,
                                   DataState dataState, AniObjectState state, Integer objectSlaveId) {
        super(stubs, dataState, state, objectSlaveId);
        this.name = name;
        this.description = description;
    }
}
