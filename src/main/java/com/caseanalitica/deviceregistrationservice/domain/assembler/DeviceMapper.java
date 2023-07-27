package com.caseanalitica.deviceregistrationservice.domain.assembler;

import com.caseanalitica.deviceregistrationservice.app.dto.response.DeviceResponse;
import com.caseanalitica.deviceregistrationservice.infra.db.Entity.Device;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DeviceMapper {

    DeviceResponse deviceToResponse(Device device);

}
