package com.ruben.waibi.product.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: BrandVo
 * @Date: 2020/5/3 10:01
 * @Description:
 */
@Data
public class BrandVo implements Serializable {
    private Long brandId;
    private String brandName;
}
