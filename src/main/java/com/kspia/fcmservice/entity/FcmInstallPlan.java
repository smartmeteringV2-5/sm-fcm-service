package com.kspia.fcmservice.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

@Data
@Entity
@Table(name = "fcmInstallPlan")

public class FcmInstallPlan implements Serializable {

    @OneToMany
    @JoinColumn(name = "installPlanSid")
    private Set<FcmInstall> fcmInstalls;


    @Id
    @Column(name = "installPlanSid")
    @NotNull
    private Long install_plan_sid;

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

    private String note;

    @Column(name = "companySid")
    private Long company_sid;

    @Column(name = "surveyNeedYn")
    private String survey_need_yn;

    @Column(name = "orgIdx")
    @NotNull
    private String org_idx;

    @Column(name = "bpLcd")
    private String bp_lcd;

    @Column(name = "planNm")
    @NotNull
    private String plan_nm;












}
