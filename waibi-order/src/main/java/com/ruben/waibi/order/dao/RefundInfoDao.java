package com.ruben.waibi.order.dao;

import com.ruben.waibi.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息; InnoDB free: 8192 kB
 * 
 * @author achao
 * @email achao1441470436@gmail.com
 * @date 2020-04-26 13:02:43
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
