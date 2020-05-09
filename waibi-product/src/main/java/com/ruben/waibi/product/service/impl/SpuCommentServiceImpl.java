package com.ruben.waibi.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruben.common.utils.PageUtils;
import com.ruben.common.utils.Query;
import com.ruben.waibi.product.dao.SpuCommentDao;
import com.ruben.waibi.product.entity.SpuCommentEntity;
import com.ruben.waibi.product.service.SpuCommentService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("spuCommentService")
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentDao, SpuCommentEntity> implements SpuCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuCommentEntity> page = this.page(
                new Query<SpuCommentEntity>().getPage(params),
                new QueryWrapper<SpuCommentEntity>()
        );

        return new PageUtils(page);
    }

}
