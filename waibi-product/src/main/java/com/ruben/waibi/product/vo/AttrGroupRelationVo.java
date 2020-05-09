package com.ruben.waibi.product.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: AttrGroupRelationVo
 * @Date: 2020/5/2 17:16
 * @Description:
 */
@Data
public class AttrGroupRelationVo implements Serializable {
    private Long attrId;
    private Long attrGroupId;
}
