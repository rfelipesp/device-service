package com.caseanalitica.deviceregistrationservice.infra.db.repository;

import com.caseanalitica.deviceregistrationservice.infra.db.Entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeviceRepository extends JpaRepository<Device, UUID> {
}
