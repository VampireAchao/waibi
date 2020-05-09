package com.ruben.waibi.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.ruben.waibi.product.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class WaibiProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaibiProductApplication.class, args);
    }

}
