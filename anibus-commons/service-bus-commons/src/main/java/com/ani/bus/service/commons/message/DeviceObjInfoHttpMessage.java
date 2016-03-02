package com.ani.bus.service.commons.message;

import com.ani.bus.service.commons.core.message.HttpMessage;
import com.ani.bus.service.commons.dto.anidevice.DeviceObjInfoDto;

import java.util.List;

/**
 * @autor zhaoyu
 * @date 16-3-2
 * @since JDK 1.7
 */
public class DeviceObjInfoHttpMessage extends HttpMessage<List<DeviceObjInfoDto>> {

    public DeviceObjInfoHttpMessage() {
    }

    public DeviceObjInfoHttpMessage(List<DeviceObjInfoDto> returnObj) {
        super(returnObj);
    }

    public DeviceObjInfoHttpMessage(ResultCode resultCode, String msg, List<DeviceObjInfoDto> returnObj) {
        super(resultCode, msg, returnObj);
    }
}
