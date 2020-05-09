package com.ruben.waibi.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: WaibiCouponApplication
 * @Date: 2020/4/26 12:41
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class WaibiCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(WaibiCouponApplication.class, args);
    }
}
