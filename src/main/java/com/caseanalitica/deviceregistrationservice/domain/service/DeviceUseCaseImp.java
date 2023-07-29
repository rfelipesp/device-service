package com.caseanalitica.deviceregistrationservice.domain.service;

import com.caseanalitica.deviceregistrationservice.app.dto.request.DeviceRequest;
import com.caseanalitica.deviceregistrationservice.app.dto.response.DeviceResponse;
import com.caseanalitica.deviceregistrationservice.cross.assembler.DeviceMapper;
import com.caseanalitica.deviceregistrationservice.domain.port.inbound.DeviceUseCase;
import com.caseanalitica.deviceregistrationservice.infra.db.repository.DeviceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeviceUseCaseImp implements DeviceUseCase {

    private final DeviceRepository deviceRepository;
    private final DeviceMapper deviceMapper;

    public DeviceUseCaseImp(DeviceRepository deviceRepository, DeviceMapper deviceMapper) {
        this.deviceRepository = deviceRepository;
        this.deviceMapper = deviceMapper;
    }

    @Override
    public List<DeviceResponse> getAllDevices() {
        return deviceRepository.findAll().stream().map(deviceMapper::deviceToResponse).collect(Collectors.toList());
    }

    @Override
    public DeviceResponse saveDevice(DeviceRequest deviceRequest) {
        var device = deviceRepository.saveAndFlush(deviceMapper.requestToDevice(deviceRequest));
        return deviceMapper.deviceToResponse(device);
    }

    @Override
    public void fillDeviceTable(String file) {

    }


}
