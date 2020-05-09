package com.ruben.waibi.order.dao;

import com.ruben.waibi.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表; InnoDB free: 8192 kB
 * 
 * @author achao
 * @email achao1441470436@gmail.com
 * @date 2020-04-26 13:02:42
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
