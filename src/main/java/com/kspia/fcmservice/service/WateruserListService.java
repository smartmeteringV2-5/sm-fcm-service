package com.kspia.fcmservice.service;

import com.kspia.fcmservice.dto.FcmConsumerSearchDto;
import com.kspia.fcmservice.repository.WateruserListRepository;
import com.kspia.fcmservice.vo.RequestWateruserListVO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @since 2023. 02. 22
 * @author jung
 *
 * @Discript
 * ---------------------------------------------------
 * 개요 : 수용가 관리 리스트 서비스 생성
 * ---------------------------------------------------
 * @EditHIstory
 * 개정이력
 * 2023.02.22 jung : 최초작성
 * 2023.02.22 jung : 수용가 관리 작업
 */
@RequiredArgsConstructor
@Service
public class WateruserListService  {
    private final WateruserListRepository wateruserListRepository;

    public Page<FcmConsumerSearchDto> getList(RequestWateruserListVO us, Pageable pageable) {
        return wateruserListRepository.wateruserByList(us, pageable);
    }
}
