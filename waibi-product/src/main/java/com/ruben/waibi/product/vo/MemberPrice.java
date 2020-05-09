/**
 * Copyright 2020 bejson.com
 */
package com.ruben.waibi.product.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Auto-generated: 2020-05-03 11:53:41
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class MemberPrice implements Serializable {

    private Long id;
    private String name;
    private BigDecimal price;


}
