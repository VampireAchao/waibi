package com.ruben.waibi.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruben.common.utils.PageUtils;
import com.ruben.waibi.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录; InnoDB free: 8192 kB
 *
 * @author achao
 * @email achao1441470436@gmail.com
 * @date 2020-04-26 12:37:54
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

