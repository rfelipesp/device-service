package com.caseanalitica.deviceregistrationservice.app.controller;

import com.caseanalitica.deviceregistrationservice.app.dto.response.DeviceResponse;
import com.caseanalitica.deviceregistrationservice.domain.port.inbound.DeviceUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceController {

    private final DeviceUseCase deviceUseCase;

    public DeviceController(DeviceUseCase deviceUseCase) {
        this.deviceUseCase = deviceUseCase;
    }

    public List<DeviceResponse> getAllDevices() {
        return deviceUseCase.getAllDevices();
    }

}
