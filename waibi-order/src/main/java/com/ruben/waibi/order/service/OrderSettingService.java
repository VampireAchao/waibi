package com.ruben.waibi.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruben.common.utils.PageUtils;
import com.ruben.waibi.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息; InnoDB free: 8192 kB
 *
 * @author achao
 * @email achao1441470436@gmail.com
 * @date 2020-04-26 13:02:43
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

