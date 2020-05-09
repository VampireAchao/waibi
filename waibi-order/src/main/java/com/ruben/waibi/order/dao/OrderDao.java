package com.ruben.waibi.order.dao;

import com.ruben.waibi.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单; InnoDB free: 8192 kB
 * 
 * @author achao
 * @email achao1441470436@gmail.com
 * @date 2020-04-26 13:02:43
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
