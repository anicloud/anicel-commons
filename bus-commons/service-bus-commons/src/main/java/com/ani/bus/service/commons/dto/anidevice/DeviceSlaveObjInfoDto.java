package com.ani.bus.service.commons.dto.anidevice;

import com.ani.bus.service.commons.dto.anidevice.stub.StubMeta;
import com.ani.octopus.commons.object.dto.state.ObjectSlaveStateDto;
import com.ani.octopus.commons.object.enumeration.AniObjectState;
import com.ani.octopus.commons.state.dto.StateTransDto;
import com.ani.octopus.commons.stub.dto.StubInfoDto;

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

    public List<StubInfoDto> stubs;


    public List<StateTransDto> stateTransDtos;

    public DeviceSlaveObjInfoDto() {
    }

    @Deprecated
    public DeviceSlaveObjInfoDto(String name, String description, List<StubInfoDto> stubs,
                                 AniObjectState state, Integer objectSlaveId) {
        this.name = name;
        this.description = description;
        this.state = state;
        this.stubs = stubs;
        this.objectSlaveId = objectSlaveId;
    }

    public DeviceSlaveObjInfoDto(String name, String description, List<StubInfoDto> stubs,
                                 AniObjectState state, Integer objectSlaveId, List<StateTransDto> stateTransDtos) {
        this.name = name;
        this.description = description;
        this.state = state;
        this.stubs = stubs;
        this.objectSlaveId = objectSlaveId;
        this.stateTransDtos = stateTransDtos;
    }
}
