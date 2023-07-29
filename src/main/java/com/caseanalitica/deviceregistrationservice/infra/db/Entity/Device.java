package com.caseanalitica.deviceregistrationservice.infra.db.Entity;

import com.caseanalitica.deviceregistrationservice.cross.utils.CalibStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "device")
@Getter
@Setter
public class Device implements Serializable {

    private static final long serialVersionUID = -1943091970103914780L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotEmpty
    @Column(name = "description", length = 50)
    private String description;

    @NotEmpty
    @Column(name = "localization", length = 50)
    private String localization;

    @NotEmpty
    @Column(name = "device_group", length = 10)
    private String deviceGroup;

    @NotEmpty
    @Column(name = "manufacturer", length = 50)
    private String manufacturer;

    @NotEmpty
    @Column(name = "model", length = 50)
    private String model;

    @NotEmpty
    @Column(name = "serial_number", length = 25)
    private String serialNumber;

    @NotEmpty
    @Column(name = "tag", length = 25)
    private String tag;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "calib_status", length = 25)
    private CalibStatus calibStatus;

    @Column(name = "status")
    private boolean status;

}
