package com.harukaze.shop.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PackageName: com.harukaze.shop.coupon
 * @ClassName: CouponApplication
 * @Description:
 * @Author: doki
 * @Date: 2022/4/10 13:53
 */

@EnableDiscoveryClient
@MapperScan("com.harukaze.shop.coupon.dao")
@SpringBootApplication
public class CouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(CouponApplication.class, args);
    }
}
