package com.caseanalitica.deviceregistrationservice.domain.port.inbound;

import com.caseanalitica.deviceregistrationservice.app.dto.request.DeviceRequest;
import com.caseanalitica.deviceregistrationservice.app.dto.response.DeviceResponse;

import java.util.List;

public interface DeviceUseCase {

    List<DeviceResponse> getAllDevices();

    DeviceResponse saveDevice(DeviceRequest deviceRequest);

    void fillDeviceTable(String file);
}
