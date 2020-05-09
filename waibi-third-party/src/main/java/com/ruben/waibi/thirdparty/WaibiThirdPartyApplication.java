package com.ruben.waibi.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WaibiThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaibiThirdPartyApplication.class, args);
    }

}
