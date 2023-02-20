package com.kspia.fcmservice.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "fcmInstall")

public class FcmInstall implements Serializable {

    @Id
    @Column(name = "installSid")
    @NotNull
    private Long install_sid;

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

    @Column(name = "installStartDt")
    private Date install_start_dt;

    @Column(name = "installEndDt")
    private Date install_end_dt;

    @Column(name = "installPlanSid")
    private Long install_plan_sid;

    private String note;

    @Column(name = "changeTypeCd")
    private String change_type_cd;

    @Column(name = "companySid")
    private Long company_sid;

    @Column(name = "consumerSid")
    @NotNull
    private Long consumer_sid;

    @Column(name = "modemSid")
    private Long modem_sid;

    @Column(name = "meterSid")
    private Long meter_sid;

    @Column(name = "installYn")
    @NotNull
    private String install_yn;

    @Column(name = "applcYn")
    private String applc_yn;

    @Column(name = "installMeterValue")
    private String install_meter_value;

    @Column(name = "removeMeterValue")
    private String remove_meter_value;

    @Column(name = "orgIdx")
    @NotNull
    private String org_idx;

    @Column(name = "bpLcd")
    private String bp_lcd;












}
