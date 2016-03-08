package com.ani.bus.service.commons.dto.anidevice;

import com.ani.bus.service.commons.dto.anidevice.stub.StubMeta;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @autor zhaoyu
 * @date 16-3-2
 * @since JDK 1.7
 */
public class DeviceSlaveObjInfoDto extends DeviceInfoDto {
    private static final long serialVersionUID = 6331836053396621328L;

    public Integer objectSlaveId;

    public DeviceSlaveObjInfoDto() {
    }

    public DeviceSlaveObjInfoDto(Integer objectSlaveId) {
        this.objectSlaveId = objectSlaveId;
    }

    public DeviceSlaveObjInfoDto(String name, String description,
                                 DeviceObjState objState,
                                 List<StubMeta> stubMetaList, Integer objectSlaveId) {
        super(name, description, objState, stubMetaList);
        this.objectSlaveId = objectSlaveId;
    }

    @Override
    public String toString() {
        return "DeviceSlaveObjInfoDto{" +
                "objectSlaveId=" + objectSlaveId +
                "} " + super.toString();
    }
}
