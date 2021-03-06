package com.ruben.waibi.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruben.common.utils.PageUtils;
import com.ruben.waibi.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格; InnoDB free: 8192 kB
 *
 * @author achao
 * @email achao1441470436@gmail.com
 * @date 2020-04-26 12:37:54
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

