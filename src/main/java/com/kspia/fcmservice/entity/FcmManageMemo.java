package com.kspia.fcmservice.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "fcmManageMemo")

public class FcmManageMemo implements Serializable {

    @Id
    @Column(name = "memoSid")
    @NotNull
    private Long memo_sid;

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
    private String delete_yn;

    @Column(name = "memoContent")
    @NotNull
    private String memo_content;

    @Column(name = "memoOrg")
    private Integer memo_org;

    @Column(name = "consumerSid")
    private Long consumer_sid;

    @Column(name = "equipSid")
    private Long equip_sid;

    @Column(name = "groupSid")
    private Long group_sid;










}
