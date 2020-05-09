package com.ruben.waibi.product.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: AttrRespVo
 * @Date: 2020/5/2 15:15
 * @Description:
 */
@Data
public class AttrRespVo extends AttrVo implements Serializable {
    private String catelogName;
    private String groupName;
    private Long[] catelogPath;
}
