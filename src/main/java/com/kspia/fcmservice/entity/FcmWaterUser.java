package com.kspia.fcmservice.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

@Data
@Entity
@Table(name = "fcmWaterUser")

public class FcmWaterUser implements Serializable {

    @OneToMany
    @JoinColumn(name = "consumerSid")
    private Set<FcmFile> fcmFiles;

    @OneToMany
    @JoinColumn(name = "consumerSid")
    private Set<FcmInstall> fcmInstalls;

    @OneToMany
    @JoinColumn(name = "consumerSid")
    private Set<FcmInstallPlan> installPlans;

    @OneToMany
    @JoinColumn(name = "consumerSid")
    private Set<FcmSurvey> fcmSurveys;

    @Id
    @Column(name = "consumerSid")
    @NotNull
    private Long consumer_sid;

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

    private String addr;

    @Column(name = "detailAddr")
    private String detail_addr;

    @Column(name = "addrG")
    private String addr_g;

    @Column(name = "zipCode")
    private String zip_code;

    @Column(name = "orgIdx")
    @NotNull
    private String org_idx;

    @Column(name = "bpLcd")
    private String bp_lcd;

    @Column(name = "bpMcd")
    private String bp_mcd;

    @Column(name = "bpScd")
    private String bp_scd;

    @Column(name = "blockMNo")
    private String block_m_no;

    @Column(name = "blockLNo")
    private String block_l_no;

    @Column(name = "blockSNo")
    private String block_s_no;

    @Column(name = "cellNo")
    private String cell_no;

    @Column(name = "consumerNm")
    @NotNull
    private String consumer_nm;

    @Column(name = "consumerNo")
    @NotNull
    private String consumer_no;

    @Column(name = "consumerState")
    @NotNull
    private String consumer_state;

    @Column(name = "consumerTypeCd")
    private String consumer_type_cd;

    @Column(name = "deleteYn")
    @NotNull
    private String delete_yn;

    @Column(name = "mngId")
    @NotNull
    private String mng_id;

    @Column(name = "tellNo")
    private String tell_no;

    @Column(name = "waterUserTypeCd")
    private String water_user_type_cd;

    @Column(name = "checkDay")
    private String check_day;

    @Column(name = "caliberCd")
    private String caliber_cd;

    @Column(name = "daumGps")
    private String daum_gps;

    @Column(name = "googleGps")
    private String google_gps;

    @Column(name = "vworldGps")
    private String vworld_gps;

    @Column(name = "employerNo")
    private String employer_no;

    @Column(name = "employerNm")
    private String employer_nm;












}
