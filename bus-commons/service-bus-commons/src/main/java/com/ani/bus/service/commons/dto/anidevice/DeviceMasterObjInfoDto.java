package com.ani.bus.service.commons.dto.anidevice;

import com.ani.octopus.commons.accout.dto.AccountDto;
import com.ani.octopus.commons.object.dto.object.privilege.ObjectMainPrivilegeDto;
import com.ani.octopus.commons.object.enumeration.AniObjectState;
import com.ani.octopus.commons.object.enumeration.AniObjectType;
import com.ani.octopus.commons.object.enumeration.DataState;
import com.ani.octopus.commons.stub.dto.StubDto;
import com.ani.utils.core.AniByte;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @autor zhaoyu
 * @date 16-3-8
 * @since JDK 1.7
 */
public class DeviceMasterObjInfoDto implements Serializable {
    private static final long serialVersionUID = -2439991687697415895L;

    public String name;
    public String description;

    public List<StubDto> stubs;
    public DataState dataState;

    public Long objectId;
    public String uniId;
    public AccountDto owner;
    public AniObjectType objectType;
    public List<ObjectMainPrivilegeDto> privileges;
    public Map<AniByte, AniObjectState> hostsState;
    public List<DeviceSlaveObjInfoDto> slaves;

    public DeviceMasterObjInfoDto() {
    }

    public DeviceMasterObjInfoDto(String name, String description, List<StubDto> stubs,
                                  DataState dataState, Long objectId, String uniId,
                                  AccountDto owner, AniObjectType objectType,
                                  List<ObjectMainPrivilegeDto> privileges,
                                  Map<AniByte, AniObjectState> hostsState,
                                  List<DeviceSlaveObjInfoDto> slaves) {
        this.name = name;
        this.description = description;
        this.stubs = stubs;
        this.dataState = dataState;
        this.objectId = objectId;
        this.uniId = uniId;
        this.owner = owner;
        this.objectType = objectType;
        this.privileges = privileges;
        this.hostsState = hostsState;
        this.slaves = slaves;
    }
}


