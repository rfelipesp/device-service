package com.caseanalitica.deviceregistrationservice.app.helper;

import com.caseanalitica.deviceregistrationservice.app.dto.response.DeviceResponse;

import java.util.ArrayList;
import java.util.List;

public interface AppHelper {

    static DeviceResponse buildDeviceResponse() {
        DeviceResponse device = new DeviceResponse();
        device.setId(1L);
        return device;
    }

    static List<DeviceResponse> buildDeviceResponseList() {
        List<DeviceResponse> deviceList = new ArrayList<>();
        deviceList.add(buildDeviceResponse());
        return deviceList;
    }

}
