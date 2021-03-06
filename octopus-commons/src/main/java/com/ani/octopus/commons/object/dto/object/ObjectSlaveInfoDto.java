package com.ani.octopus.commons.object.dto.object;

import com.ani.octopus.commons.object.dto.state.ObjectSlaveStateDto;
import com.ani.octopus.commons.object.enumeration.AniObjectState;
import com.ani.octopus.commons.object.enumeration.DataState;
import com.ani.octopus.commons.stub.dto.StubInfoDto;

import java.util.List;

/**
 * Created by yeh on 15-12-1.
 */
public class ObjectSlaveInfoDto extends ObjectInfoDto {

    private static final long serialVersionUID = 5327411969701236213L;

//    public AniObjectState state;

    public ObjectSlaveStateDto objectSlaveState;

    public Integer objectSlaveId;

    private ObjectMainInfoDto slaveMain;

    public ObjectMainInfoDto getSlaveMain() {
        return this.slaveMain;
    }

    public ObjectSlaveInfoDto() {
    }

    public ObjectSlaveInfoDto(List<StubInfoDto> stubs, DataState dataState, Integer objectSlaveId) {
        super(stubs, dataState);
        this.objectSlaveId = objectSlaveId;
    }

    public ObjectSlaveInfoDto(List<StubInfoDto> stubs, DataState dataState, Integer objectSlaveId, ObjectMainInfoDto mainInfoDto) {
        super(stubs, dataState);
        this.objectSlaveId = objectSlaveId;
        this.slaveMain = mainInfoDto;
    }

//    public ObjectSlaveInfoDto(List<StubInfoDto> stubs, DataState dataState, AniObjectState state, Integer objectSlaveId) {
//        super(stubs, dataState);
//        this.state = state;
//        this.objectSlaveId = objectSlaveId;
//    }
//
//    public ObjectSlaveInfoDto(List<StubInfoDto> stubs, DataState dataState, AniObjectState state, Integer objectSlaveId, ObjectMainInfoDto mainInfoDto) {
//        super(stubs, dataState);
//        this.state = state;
//        this.objectSlaveId = objectSlaveId;
//        this.slaveMain = mainInfoDto;
//    }

    public ObjectSlaveInfoDto(List<StubInfoDto> stubs, DataState dataState, ObjectSlaveStateDto objectSlaveState, Integer objectSlaveId) {
        super(stubs, dataState);
        this.objectSlaveState = objectSlaveState;
        this.objectSlaveId = objectSlaveId;
    }

    public ObjectSlaveInfoDto(List<StubInfoDto> stubs, DataState dataState, ObjectSlaveStateDto objectSlaveState, Integer objectSlaveId, ObjectMainInfoDto slaveMain) {
        super(stubs, dataState);
        this.objectSlaveState = objectSlaveState;
        this.objectSlaveId = objectSlaveId;
        this.slaveMain = slaveMain;
    }
}
