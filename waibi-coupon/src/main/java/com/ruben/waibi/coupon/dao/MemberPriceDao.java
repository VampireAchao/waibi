package com.ruben.waibi.coupon.dao;

import com.ruben.waibi.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格; InnoDB free: 8192 kB
 * 
 * @author achao
 * @email achao1441470436@gmail.com
 * @date 2020-04-26 12:37:54
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
