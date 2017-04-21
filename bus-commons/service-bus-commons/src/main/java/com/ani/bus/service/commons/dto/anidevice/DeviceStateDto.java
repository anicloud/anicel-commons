package com.ani.bus.service.commons.dto.anidevice;

import java.io.Serializable;

/**
 * Created by zsl on 17-4-20.
 */
public class DeviceStateDto implements Serializable {
    private Long groupId;
    private Integer stateId;

    public DeviceStateDto(Long groupId, Integer stateId) {
        this.groupId = groupId;
        this.stateId = stateId;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
