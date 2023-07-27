package com.caseanalitica.deviceregistrationservice.app.controller;

import com.caseanalitica.deviceregistrationservice.app.helper.AppHelper;
import com.caseanalitica.deviceregistrationservice.domain.service.DeviceUseCaseImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class DeviceControllerTest {

    private DeviceController deviceController;
    private DeviceUseCaseImp deviceUseCaseImp;

    @BeforeEach
    void init() {
        this.deviceUseCaseImp = mock(DeviceUseCaseImp.class);
        this.deviceController = new DeviceController(deviceUseCaseImp);
    }

    @Test
    void deviceControllerSuccess() {

        when(deviceUseCaseImp.getAllDevices()).thenReturn(AppHelper.buildDeviceResponseList());

        deviceController.getAllDevices();

        verify(deviceUseCaseImp, times(1)).getAllDevices();
    }

}