package com.caseanalitica.deviceregistrationservice.app.helper;

import com.caseanalitica.deviceregistrationservice.app.dto.response.DeviceResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface AppHelper {

    static DeviceResponse buildDeviceResponse() {
        DeviceResponse device = new DeviceResponse();
        device.setUuid(UUID.fromString("41c4fd68-2c9a-11ee-be56-0242ac120002"));
        return device;
    }

    static List<DeviceResponse> buildDeviceResponseList() {
        List<DeviceResponse> deviceList = new ArrayList<>();
        deviceList.add(buildDeviceResponse());
        return deviceList;
    }

}
