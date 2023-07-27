package com.caseanalitica.deviceregistrationservice.app.rest;

import com.caseanalitica.deviceregistrationservice.app.controller.DeviceController;
import com.caseanalitica.deviceregistrationservice.app.dto.response.DeviceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import java.util.List;

@RestController
@RequestMapping("/device")
@Consumes
public class DeviceRegistrationEntrypoint {

    private final DeviceController deviceController;

    public DeviceRegistrationEntrypoint(DeviceController deviceController) {
        this.deviceController = deviceController;
    }

    @GetMapping
    public ResponseEntity<List<DeviceResponse>> getAllDevices() {
        return new ResponseEntity<>(deviceController.getAllDevices(), HttpStatus.OK);
    }

}
