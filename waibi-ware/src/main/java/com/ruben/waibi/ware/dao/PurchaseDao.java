package com.ruben.waibi.ware.dao;

import com.ruben.waibi.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息; InnoDB free: 8192 kB
 * 
 * @author achao
 * @email achao1441470436@gmail.com
 * @date 2020-04-26 13:07:27
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
