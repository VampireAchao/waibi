package com.ruben.waibi.product.dao;

import com.ruben.waibi.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author achao
 * @email achao1441470436@gmail.com
 * @date 2020-04-26 09:34:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
