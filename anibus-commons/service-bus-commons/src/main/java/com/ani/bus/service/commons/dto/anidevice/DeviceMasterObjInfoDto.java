package com.ani.bus.service.commons.dto.anidevice;

import com.ani.octopus.commons.accout.dto.AccountDto;
import com.ani.octopus.commons.object.dto.object.ObjectMainInfoDto;
import com.ani.octopus.commons.object.dto.object.ObjectSlaveInfoDto;
import com.ani.octopus.commons.object.dto.object.privilege.ObjectMainPrivilegeDto;
import com.ani.octopus.commons.object.enumeration.AniObjectState;
import com.ani.octopus.commons.object.enumeration.AniObjectType;
import com.ani.octopus.commons.object.enumeration.DataState;
import com.ani.octopus.commons.stub.dto.StubDto;
import com.ani.utils.core.AniByte;

import java.util.List;
import java.util.Map;

/**
 * @autor zhaoyu
 * @date 16-3-8
 * @since JDK 1.7
 */
public class DeviceMasterObjInfoDto extends ObjectMainInfoDto {
    private static final long serialVersionUID = -2439991687697415895L;

    public String name;
    public String description;

    public DeviceMasterObjInfoDto() {
    }

    public DeviceMasterObjInfoDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public DeviceMasterObjInfoDto(String name, String description, List<StubDto> stubs, DataState dataState, Long objectId,
                                  String uniId, AccountDto owner, AniObjectType objectType,
                                  List<ObjectMainPrivilegeDto> privileges, Map<AniByte, AniObjectState> hostsState,
                                  List<ObjectSlaveInfoDto> slaves) {
        super(stubs, dataState, objectId, uniId, owner, objectType, privileges, hostsState, slaves);
        this.name = name;
        this.description = description;
    }
}


