package com.ruben.waibi.ware.dao;

import com.ruben.waibi.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息; InnoDB free: 8192 kB
 * 
 * @author achao
 * @email achao1441470436@gmail.com
 * @date 2020-04-26 13:07:27
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
