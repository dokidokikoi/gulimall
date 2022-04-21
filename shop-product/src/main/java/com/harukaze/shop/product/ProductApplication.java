package com.harukaze.shop.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PackageName: com.harukaze.shop.product
 * @ClassName: ProductApplication
 * @Description:
 * @Author: doki
 * @Date: 2022/4/10 13:30
 */
@EnableFeignClients(basePackages = "com.harukaze.shop.product.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
