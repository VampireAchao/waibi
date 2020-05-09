package com.ruben.waibi.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruben.common.utils.PageUtils;
import com.ruben.waibi.product.entity.AttrAttrgroupRelationEntity;
import com.ruben.waibi.product.vo.AttrGroupRelationVo;

import java.util.List;
import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author achao
 * @email achao1441470436@gmail.com
 * @date 2020-04-26 09:34:24
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveBatch(List<AttrGroupRelationVo> vos);
}

