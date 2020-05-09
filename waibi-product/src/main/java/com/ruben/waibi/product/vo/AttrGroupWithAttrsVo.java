package com.ruben.waibi.product.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.ruben.waibi.product.entity.AttrEntity;
import jdk.internal.util.xml.impl.Attrs;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: AttrGroupWithAttrsVo
 * @Date: 2020/5/3 10:30
 * @Description:
 */
@Data
public class AttrGroupWithAttrsVo implements Serializable {
    /**
     * 分组id
     */
    private Long attrGroupId;
    /**
     * 组名
     */
    private String attrGroupName;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 描述
     */
    private String descript;
    /**
     * 组图标
     */
    private String icon;
    /**
     * 所属分类id
     */
    private Long catelogId;

    private List<AttrEntity> attrs;

}
