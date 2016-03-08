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
public class DeviceObjInfoDto implements Serializable {
    private static final long serialVersionUID = 6331836053396621328L;

    public Long objectId;
    public String uniId;
    public Long accountId;

    public String name;
    public String description;
    public DeviceObjState objState;

    public List<StubMeta> stubMetaList;

    public DeviceObjInfoDto() {
    }

    public DeviceObjInfoDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public DeviceObjInfoDto(List<StubMeta> stubMetaList, Long objectId, String uniId, Long accountId, DeviceObjState objState) {
        this.stubMetaList = stubMetaList;
        this.objectId = objectId;
        this.uniId = uniId;
        this.accountId = accountId;
        this.objState = objState;
    }

    public DeviceObjInfoDto(Long objectId, String uniId, Long accountId, String name, String description, DeviceObjState objState, List<StubMeta> stubMetaList) {
        this.objectId = objectId;
        this.uniId = uniId;
        this.accountId = accountId;
        this.name = name;
        this.description = description;
        this.objState = objState;
        this.stubMetaList = stubMetaList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeviceObjInfoDto infoDto = (DeviceObjInfoDto) o;
        return Objects.equals(objectId, infoDto.objectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId);
    }

    @Override
    public String toString() {
        return "DeviceObjInfoDto{" +
                "objectId=" + objectId +
                ", uniId='" + uniId + '\'' +
                ", accountId=" + accountId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", objState=" + objState +
                '}';
    }
}
