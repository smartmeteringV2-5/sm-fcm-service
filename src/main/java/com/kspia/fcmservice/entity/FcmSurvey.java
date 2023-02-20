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
@Table(name = "fcmSurvey")

public class FcmSurvey implements Serializable {

    @Id
    @Column(name = "surveySid")
    @NotNull
    private Long survey_sid;

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

    @Column(name = "surveyNm")
    @NotNull
    private String survey_nm;

    @Column(name = "consumerSid")
    @NotNull
    private Long consumer_sid;

    @Column(name = "surveyDate")
    @NotNull
    private Date survey_date;

    @Column(name = "workType")
    private String work_type;

    @Column(name = "installType")
    private String install_type;

    private String note;

    @Column(name = "innerRssi")
    private Integer inner_rssi;

    @Column(name = "outerRssi")
    private Integer outer_rssi;

    @Column(name = "tubeType")
    private String tube_type;

    @Column(name = "workerSid")
    private Long worker_sid;

    @Column(name = "deleteYn")
    private String delete_yn;

    @Column(name = "orgIdx")
    @NotNull
    private String org_idx;

    @Column(name = "bpLcd")
    private String bp_lcd;

    @Column(name = "installPlanCd")
    private String install_plan_cd;

    @Column(name = "completeDate")
    private Date complete_date;


}
