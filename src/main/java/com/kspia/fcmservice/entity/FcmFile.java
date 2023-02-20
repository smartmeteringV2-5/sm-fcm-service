package com.kspia.fcmservice.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "fcmFile")

public class FcmFile implements Serializable {

    @Id
    @Column(name = "fileSid")
    @NotNull
    private Long file_sid;

    @Column(name = "tableType")
    @NotNull
    private String table_type;

    @Column(name = "detailType")
    @NotNull
    private String detail_type;

    @Column(name = "consumerSid")
    @NotNull
    private Long consumer_sid;

    @NotNull
    private String path;

    @NotNull
    private String thumbnail;

    @Column(name = "deleteYn")
    @NotNull
    private String delete_yn;













}
