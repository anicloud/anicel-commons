package com.ani.bus.service.commons.message;

import com.ani.bus.service.commons.dto.anidevice.DeviceMasterObjInfoDto;
import com.ani.octopus.commons.message.http.HttpMessage;

import java.util.List;

/**
 * @autor zhaoyu
 * @date 16-3-2
 * @since JDK 1.7
 */
public class DeviceObjInfoHttpMessage extends HttpMessage<List<DeviceMasterObjInfoDto>> {

    public DeviceObjInfoHttpMessage() {
    }

    public DeviceObjInfoHttpMessage(List<DeviceMasterObjInfoDto> returnObj) {
        super(returnObj);
    }

    public DeviceObjInfoHttpMessage(ResultCode resultCode, String msg, List<DeviceMasterObjInfoDto> returnObj) {
        super(resultCode, msg, returnObj);
    }
}
