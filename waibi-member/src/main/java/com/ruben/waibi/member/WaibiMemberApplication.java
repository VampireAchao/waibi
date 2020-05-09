package com.ruben.waibi.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.ruben.waibi.member.feign")
public class WaibiMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaibiMemberApplication.class, args);
    }

}
