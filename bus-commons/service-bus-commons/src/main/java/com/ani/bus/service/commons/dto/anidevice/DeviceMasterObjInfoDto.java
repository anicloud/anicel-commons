package com.ani.bus.service.commons.dto.anidevice;

import com.ani.earth.commons.dto.AccountDto;
import com.ani.octopus.commons.object.enumeration.AniObjectState;
import com.ani.octopus.commons.stub.dto.StubInfoDto;

import java.io.Serializable;
import java.util.List;

/**
 * @autor zhaoyu
 * @date 16-3-8
 * @since JDK 1.7
 */
public class DeviceMasterObjInfoDto implements Serializable {
    private static final long serialVersionUID = -2439991687697415895L;

    public String name;
    public String description;

    public List<StubInfoDto> stubs;

    public Long objectId;
    public AccountDto owner;
    public AniObjectState state;
    public List<DeviceSlaveObjInfoDto> slaves;

    public DeviceMasterObjInfoDto() {
    }

    public DeviceMasterObjInfoDto(String name, String description, List<StubInfoDto> stubs,
                                  Long objectId, AccountDto owner,
                                  AniObjectState state,
                                  List<DeviceSlaveObjInfoDto> slaves) {
        this.name = name;
        this.description = description;
        this.stubs = stubs;
        this.objectId = objectId;
        this.owner = owner;
        this.state = state;
        this.slaves = slaves;
    }
}


