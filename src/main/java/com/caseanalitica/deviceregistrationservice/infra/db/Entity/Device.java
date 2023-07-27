package com.caseanalitica.deviceregistrationservice.infra.db.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="device")
@Getter
@Setter
public class Device implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uuid")
    private UUID uuid;

    @NotEmpty
    @Column(name = "description",length = 50)
    private String description;

    @NotEmpty
    @Column(name = "localization",length = 10)
    private String localization;

    @NotEmpty
    @Column(name = "group",length = 10)
    private String group;

    @NotEmpty
    @Column(name = "manufacturer",length = 50)
    private String manufacturer;

    @NotEmpty
    @Column(name = "model",length = 50)
    private String model;

    @NotEmpty
    @Column(name = "serialNumber",length = 25)
    private String serialNumber;

    @NotEmpty
    @Column(name = "tag",length = 10)
    private String tag;

    @NotEmpty
    @Column(name = "calibrated")
    private boolean calibrated;

}
