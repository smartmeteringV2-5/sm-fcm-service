package com.kspia.fcmservice.repository.impl;

import com.kspia.fcmservice.dto.FcmConsumerSearchDto;
import com.kspia.fcmservice.entity.QFcmWaterUser;
import com.kspia.fcmservice.repository.WateruserListRepository;
import com.kspia.fcmservice.vo.RequestWateruserListVO;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @since 2023. 02. 22
 * @author jung
 *
 * @Discript
 * ---------------------------------------------------
 * 개요 : 수용가 관리 리스트 RepositoryImpl 생성
 * ---------------------------------------------------
 * @EditHIstory
 * 개정이력
 * 2023-02.22 jung: 최초 작성
 * 2023.02.22 jung : 수용가 관리 리스트 RepositoryImpl 작업
 */

@Repository
public class WateruserListRepositoryImpl implements WateruserListRepository {

    private final JPAQueryFactory jpaQueryFactory;

    public WateruserListRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    QFcmWaterUser fcmWaterUser = QFcmWaterUser.fcmWaterUser;

    @NotNull
    @Override
    public Page<FcmConsumerSearchDto> wateruserByList(RequestWateruserListVO us, Pageable pageable) {

        List<FcmConsumerSearchDto> results = jpaQueryFactory.select(Projections.fields(FcmConsumerSearchDto.class,
                        fcmWaterUser.mng_id, fcmWaterUser.consumer_no, fcmWaterUser.consumer_nm.as("consumerName"),
                        fcmWaterUser.addr.as("address"), fcmWaterUser.bp_lcd, fcmWaterUser.bp_mcd,
                        fcmWaterUser.consumer_type_cd.as("consumerTypeStr"), fcmWaterUser.consumer_state.as("consumerStateStr")
                        ))
                        .from(fcmWaterUser)
                        .where(eqAreaId(us.getAreaId()),eqDongId(us.getDongId()), eqConsumerTypeCd(us.getConsumerTypeCd()),
                        eqConsumerState(us.getConsumerState()), eqMngId(us.getMngId()), eqConsumerNo(us.getConsumerNo()),
                        eqConsumerName(us.getConsumerName()), eqAddress(us.getAddress()))
                        .offset(us.getPage() * us.getSize())
                        .limit(us.getSize())
                        .fetch();
        long total = jpaQueryFactory.select(fcmWaterUser.count()).from(fcmWaterUser)
                .where(eqAreaId(us.getAreaId()),eqDongId(us.getDongId()), eqConsumerTypeCd(us.getConsumerTypeCd()),
                        eqConsumerState(us.getConsumerState()), eqMngId(us.getMngId()), eqConsumerNo(us.getConsumerNo()),
                        eqConsumerName(us.getConsumerName()), eqAddress(us.getAddress()))
                .fetchOne();
        Pageable pageable1 = PageRequest.of(us.getPage(), us.getSize(), Sort.by("asc"));
        return new PageImpl<>(results, pageable1,total);
    }
    private BooleanExpression eqAreaId(String areaId) {
        if (areaId == null || areaId.equals("0")) {
            return null;
        }
        return fcmWaterUser.org_idx.eq(areaId);
    }

    private BooleanExpression eqDongId(String dongId) {
        if (dongId == null || dongId == "") {
            return null;
        }
        return  fcmWaterUser.bp_mcd.eq(dongId);
    }

    private BooleanExpression eqConsumerTypeCd(String consumerTypeCd) {
        if (consumerTypeCd == null || consumerTypeCd == "") {
            return null;
        }
        return fcmWaterUser.consumer_type_cd.eq(consumerTypeCd);
    }

    private BooleanExpression eqConsumerState(String consumerState) {
        if (consumerState == null || consumerState == "") {
            return null;
        }
        return fcmWaterUser.consumer_state.eq(consumerState);
    }

    private BooleanExpression eqMngId(String mngId) {
        if (mngId == null || mngId == "") {
            return null;
        }
        return fcmWaterUser.mng_id.eq(mngId);
    }

    private BooleanExpression eqConsumerNo(String consumerNo) {
        if (consumerNo == null || consumerNo == "") {
            return null;
        }
        return fcmWaterUser.consumer_no.eq(consumerNo);
    }

    private BooleanExpression eqConsumerName(String consumerName) {
        if (consumerName == null || consumerName == "") {
            return null;
        }
        return fcmWaterUser.consumer_nm.eq(consumerName);
    }

    private BooleanExpression eqAddress(String address) {
        if (address == null || address == "") {
            return null;
        }
        return fcmWaterUser.addr.eq(address);
    }


}
