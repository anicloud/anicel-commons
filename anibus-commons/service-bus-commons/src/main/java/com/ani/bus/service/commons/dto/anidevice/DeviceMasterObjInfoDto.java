package com.ani.bus.service.commons.dto.anidevice;

import java.util.List;

/**
 * @autor zhaoyu
 * @date 16-3-8
 * @since JDK 1.7
 */
public class DeviceMasterObjInfoDto extends DeviceInfoDto {
    private static final long serialVersionUID = -2439991687697415895L;

    public Long objectId;
    public String uniId;
    public Long accountId;

    List<DeviceSlaveObjInfoDto> slaveObjInfoDtoList;

    public DeviceMasterObjInfoDto() {
    }

    public DeviceMasterObjInfoDto(Long objectId, String uniId,
                                  Long accountId, List<DeviceSlaveObjInfoDto> slaveObjInfoDtoList) {
        this.objectId = objectId;
        this.uniId = uniId;
        this.accountId = accountId;
        this.slaveObjInfoDtoList = slaveObjInfoDtoList;
    }


}
