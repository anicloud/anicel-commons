package com.ani.bus.device.commons.dto.device;


import java.io.Serializable;
import java.util.List;

/**
 * Created by zhanglina on 17-6-19.
 */
public class DeviceSlaveInfoDto implements Serializable{
    private static final long serialVersionUID = 8052974095229895010L;
    public Long masterId;
    public Integer deviceId;
    public String name;
    public String description;
    public List<Integer> tags;
    public Long owenerId;
    public DeviceSlaveInfoDto(Integer deviceId,String name,String description,List<Integer> tags){

        this.deviceId=deviceId;
        this.name=name;
        this.description=description;
        this.tags=tags;

    }
    public DeviceSlaveInfoDto(Long masterId,Integer deviceId,String name,String description,List<Integer> tags,long owenerId){

        this.masterId =masterId;
        this.deviceId=deviceId;
        this.name=name;
        this.description=description;
        this.tags=tags;
        this.owenerId=owenerId;
    }
    public static DeviceSlaveInfoDto fretchDeviceSlaveDto(DeviceSlaveDto deviceSlaveDto){
        return new DeviceSlaveInfoDto(
                deviceSlaveDto.deviceId,
                deviceSlaveDto.name,
                deviceSlaveDto.description,
                deviceSlaveDto.tags);
    }
}
