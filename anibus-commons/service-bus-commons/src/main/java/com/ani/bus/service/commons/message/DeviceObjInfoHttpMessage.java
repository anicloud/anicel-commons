package com.ani.bus.service.commons.message;

import com.ani.bus.service.commons.core.message.HttpMessage;
import com.ani.bus.service.commons.dto.anidevice.DeviceSlaveObjInfoDto;

import java.util.List;

/**
 * @autor zhaoyu
 * @date 16-3-2
 * @since JDK 1.7
 */
public class DeviceObjInfoHttpMessage extends HttpMessage<List<DeviceSlaveObjInfoDto>> {

    public DeviceObjInfoHttpMessage() {
    }

    public DeviceObjInfoHttpMessage(List<DeviceSlaveObjInfoDto> returnObj) {
        super(returnObj);
    }

    public DeviceObjInfoHttpMessage(ResultCode resultCode, String msg, List<DeviceSlaveObjInfoDto> returnObj) {
        super(resultCode, msg, returnObj);
    }
}
