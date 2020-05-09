package com.ruben.waibi.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: MergeVo
 * @Date: 2020/5/4 13:03
 * @Description:
 */
@Data
public class MergeVo {
    private Long purchaseId;        //整单id
    private List<Long> items;       //合并项集合
}
