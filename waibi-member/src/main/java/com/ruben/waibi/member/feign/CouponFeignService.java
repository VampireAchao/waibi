package com.ruben.waibi.member.feign;

import com.ruben.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: CouponFeignService
 * @Date: 2020/4/26 16:47
 * @Description:
 */
@FeignClient("waibi-coupon")
public interface CouponFeignService {
    @RequestMapping("coupon/coupon/member/list")
    public R membercoupons();
}
