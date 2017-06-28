package com.ani.bus.device.commons.dto.device;
import com.ani.bus.device.commons.dto.message.ByteSerializable;

import java.io.Serializable;
import java.util.List;
/**
 * Created by zhanglina on 17-6-19.
 */
public class DeviceMasterInfoDto implements Serializable {

    private static final long serialVersionUID = -6578524898733455618L;

    public Long deviceId;
    public String name;
    public String description;
    public Long owenerId;
    public DeviceMasterInfoDto(Long deviceId,String name,String description){
        this.deviceId=deviceId;
        this.name=name;
        this.description=description;

    }
    public DeviceMasterInfoDto(Long deviceId,String name,String description,Long owenerId){

        this.deviceId=deviceId;
        this.name=name;
        this.description=description;
        this.owenerId=owenerId;
    }
    public  static DeviceMasterInfoDto fetchDeviceMasterDto(DeviceMasterDto deviceMasterDto){
        return new DeviceMasterInfoDto(
                deviceMasterDto.deviceId,
                deviceMasterDto.name,
                deviceMasterDto.description
        );
    }
}
