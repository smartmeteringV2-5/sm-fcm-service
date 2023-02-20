package com.kspia.fcmservice.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

@Data
@Entity
@Table(name = "fcmMeterEquip")

public class FcmMeterEquip implements Serializable {

    @OneToMany
    @JoinColumn(name = "meterSid")
    private Set<FcmInstall> fcmInstalls;

    @Id
    @Column(name = "meterSid")
    @NotNull
    private Long meter_sid;

    @Column(name = "createdUser")
    @NotNull
    private String created_user;

    @Column(name = "createdDate")
    @NotNull
    private Timestamp created_date;

    @Column(name = "lastModifiedUser")
    private String last_modified_user;

    @Column(name = "lastModifiedDate")
    private Timestamp last_modified_date;

    @Column(name = "deleteYn")
    @NotNull
    private String delete_yn;

    @Column(name = "orgIdx")
    @NotNull
    private String org_idx;

    @Column(name = "meterId")
    @NotNull
    private String meter_id;

    @Column(name = "caliberCd")
    private String caliber_cd;

    @Column(name = "commTypeCd")
    private String comm_type_cd;

    @Column(name = "companySid")
    private Long company_sid;

    @Column(name = "modelTypeCd")
    private String model_type_cd;

    @Column(name = "modelCd")
    private String model_cd;

    @Column(name = "mainEquipYn")
    private String main_equip_yn;










}
