package com.kspia.fcmservice.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @since 2023. 02. 22
 * @author jung
 *
 * @Discript
 * ---------------------------------------------------
 * 개요 : 수용가 관리 FcmConsumerSearchDto 생성
 * ---------------------------------------------------
 * @EditHIstory
 * 개정이력
 * 2023-02.22 jung : 최초 작성
 * 2023.02.22 jung : 수용가 관리 작업
 */
@Data
@NoArgsConstructor
public class FcmConsumerSearchDto {
    //사업소
    private String areaId;
    //행정동
    private String dongId;
    //수용가 유형
    private String consumerTypeCd;
    //급수전 구분
    private String consumerState;
    //고객번호
    private String mngId;
    //수용가번호
    private String consumerNo;
    //성명
    private String consumerName;
    //도로명주소
    private String address;
}
