package com.kspia.fcmservice.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class RequestWateruserListVO {
	private int page;
	private int size;

	private String mngId;  //- 고객번호
	private String consumerNo;  // - 고객번호
	private String consumerName;  // - 고객명
	private String address;
	private String waterUseTypeStr;
	private String bpLcd;  // - 사업소
	private String bpMcd;  // - 행정동
	private String bpScd;
	private String consumerTypeStr; // 가구형태
	private String consumerStateStr; // 급수전 구분
	//사업소
	private String areaId;
	//행정동
	private String dongId;
	//분구
	private String consumerTypeCd;
	//급수전 구분
	private String consumerState;


}
