package com.caseanalitica.deviceregistrationservice.app.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class DeviceResponse {

    private UUID uuid;
    private String description;
    private String localization;
    private String group;
    private String manufacturer;
    private String model;
    private String serialNumber;
    private String tag;
    private boolean calibrated;

}
