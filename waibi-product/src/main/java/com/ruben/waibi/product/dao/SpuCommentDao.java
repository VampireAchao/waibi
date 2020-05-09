package com.ruben.waibi.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruben.waibi.product.entity.SpuCommentEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 *
 * @author achao
 * @email achao1441470436@gmail.com
 * @date 2020-04-26 09:34:24
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {

}
