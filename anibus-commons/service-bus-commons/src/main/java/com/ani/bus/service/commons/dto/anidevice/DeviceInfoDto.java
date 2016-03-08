package com.ani.bus.service.commons.dto.anidevice;

import com.ani.bus.service.commons.dto.anidevice.stub.StubMeta;

import java.io.Serializable;
import java.util.List;

/**
 * @autor zhaoyu
 * @date 16-3-8
 * @since JDK 1.7
 */
public abstract class DeviceInfoDto implements Serializable {
    private static final long serialVersionUID = -166693200290278449L;

    public String name;
    public String description;
    public DeviceObjState objState;

    public List<StubMeta> stubMetaList;

    public DeviceInfoDto() {
    }

    public DeviceInfoDto(String name, String description,
                         DeviceObjState objState, List<StubMeta> stubMetaList) {
        this.name = name;
        this.description = description;
        this.objState = objState;
        this.stubMetaList = stubMetaList;
    }

    @Override
    public String toString() {
        return "DeviceInfoDto{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", objState=" + objState +
                '}';
    }
}
