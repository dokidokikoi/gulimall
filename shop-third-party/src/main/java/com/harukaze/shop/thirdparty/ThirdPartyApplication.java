package com.harukaze.shop.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PackageName: com.harukaze.shop.thirdparty
 * @ClassName: ThirdPartyApplication
 * @Description:
 * @Author: doki
 * @Date: 2022/4/17 2:14
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdPartyApplication.class, args);
    }
}
