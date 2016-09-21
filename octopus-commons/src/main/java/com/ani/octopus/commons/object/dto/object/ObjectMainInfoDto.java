package com.ani.octopus.commons.object.dto.object;

import com.ani.earth.commons.dto.AccountDto;
import com.ani.octopus.commons.object.enumeration.AniObjectState;
import com.ani.octopus.commons.object.enumeration.AniObjectType;
import com.ani.octopus.commons.object.dto.object.privilege.ObjectMainPrivilegeDto;
import com.ani.octopus.commons.object.enumeration.DataState;
import com.ani.octopus.commons.stub.dto.StubDto;
import com.ani.utils.core.AniByte;

import java.util.List;
import java.util.Map;

/**
 * Created by yeh on 15-12-1.
 */
public class ObjectMainInfoDto extends ObjectInfoDto {

    private static final long serialVersionUID = -4427768507587282409L;
    public Long objectId;

    public String uniId;

    public AccountDto owner;

    public AniObjectType objectType;

    public List<ObjectMainPrivilegeDto> privileges;

    public Map<AniByte, AniObjectState> hostsState;

    public List<ObjectSlaveInfoDto> slaves;

    public ObjectMainInfoDto() {
        super();
    }

    public ObjectMainInfoDto(List<StubDto> stubs, DataState dataState, Long objectId, String uniId, AccountDto owner, AniObjectType objectType, List<ObjectMainPrivilegeDto> privileges, Map<AniByte, AniObjectState> hostsState, List<ObjectSlaveInfoDto> slaves) {
        super(stubs, dataState);
        this.objectId = objectId;
        this.uniId = uniId;
        this.owner = owner;
        this.objectType = objectType;
        this.privileges = privileges;
        this.hostsState = hostsState;
        this.slaves = slaves;
    }
}
