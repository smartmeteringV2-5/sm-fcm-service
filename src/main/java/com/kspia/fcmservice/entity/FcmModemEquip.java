package com.kspia.fcmservice.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "fcmModemEquip")

public class FcmModemEquip implements Serializable {

    @OneToMany
    @JoinColumn(name = "modemSid")
    private Set<FcmInstall> fcmInstalls;

    @Id
    @Column(name = "modemSid")
    @NotNull
    private Long modem_sid;

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

    @Column(name = "deliveryDate")
    private Date delivery_date;

    @Column(name = "equipStatus")
    private String equip_status;

    @Column(name = "expireYear")
    private String expire_year;

    @Column(name = "bpLcd")
    private String bp_lcd;

    @Column(name = "locX")
    private String loc_x;

    @Column(name = "locY")
    private String loc_y;

    @Column(name = "orgIdx")
    @NotNull
    private String org_idx;

    @Column(name = "modemId")
    @NotNull
    private String modem_id;

    @Column(name = "companySid")
    private Long company_sid;

    @Column(name = "modemCd")
    private String modem_cd;

    @Column(name = "modemTypeCd")
    private String modem_type_cd;

    @Column(name = "modemInfoSid")
    private Long modem_info__sid;

    @Column(name = "telecomCd")
    private String telecom_cd;

    @Column(name = "appeuiEntityid")
    @NotNull
    private String appeui_entity_id;

    @Column(name = "debugYn")
    @NotNull
    private String debug_yn;

    @Column(name = "deveuiImei")
    @NotNull
    private String deveui_imei;

    private String etc;

    private String protocol;

    @Column(name = "ukeyImsi")
    @NotNull
    private String ukey_imsi;










}
