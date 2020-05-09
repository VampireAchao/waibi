package com.ruben.waibi.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruben.common.to.SkuReductionTo;
import com.ruben.common.utils.PageUtils;
import com.ruben.waibi.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息; InnoDB free: 8192 kB
 *
 * @author achao
 * @email achao1441470436@gmail.com
 * @date 2020-04-26 12:37:54
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo reductionTo);
}

