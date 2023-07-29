package com.caseanalitica.deviceregistrationservice.app.rest;

import com.caseanalitica.deviceregistrationservice.app.controller.DeviceController;
import com.caseanalitica.deviceregistrationservice.app.dto.request.DeviceRequest;
import com.caseanalitica.deviceregistrationservice.app.dto.response.DeviceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device")
public class DeviceRegistrationApi {

    private final DeviceController deviceController;

    public DeviceRegistrationApi(DeviceController deviceController) {
        this.deviceController = deviceController;
    }

    @GetMapping
    public ResponseEntity<List<DeviceResponse>> getAllDevices() {
        return new ResponseEntity<>(deviceController.getAllDevices(), HttpStatus.OK);
    }

    @PostMapping(produces = {"application/json", "application/xml", "application/x-yaml"},
            consumes = {"application/json", "application/xml", "application/x-yaml"})
    public ResponseEntity<DeviceResponse> createDevice(@RequestBody DeviceRequest deviceRequest) {
        DeviceResponse deviceResponse = deviceController.saveDevice(deviceRequest);
        return new ResponseEntity<>(deviceResponse, HttpStatus.OK);
    }

}
