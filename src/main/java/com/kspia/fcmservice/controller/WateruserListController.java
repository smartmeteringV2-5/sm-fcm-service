package com.kspia.fcmservice.controller;

import com.kspia.fcmservice.dto.FcmConsumerSearchDto;
import com.kspia.fcmservice.service.WateruserListService;
import com.kspia.fcmservice.vo.RequestWateruserListVO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

/**
 * @since 2023. 02. 22
 * @author jung
 *
 * @Discript
 * ---------------------------------------------------
 * 개요 : 수용가 관리 컨트롤러 생성
 * ---------------------------------------------------
 * @EditHIstory
 * 개정이력
 * 2023-02.22 jung: 최초 작성
 * 2023.02.22 jung : 수용가 관리
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/sm-fcm-service")
public class WateruserListController {
    private final WateruserListService wateruserListService;
    @ResponseBody
    @RequestMapping(value = "/wateruser/list", method ={RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Page<FcmConsumerSearchDto> getList(@RequestBody RequestWateruserListVO us, Pageable pageable){
        Page<FcmConsumerSearchDto> fcmConsumerSearchList = wateruserListService.getList(us, pageable);

        return fcmConsumerSearchList;

    }
}
