package com.harukaze.shop.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @PackageName: com.harukaze.shop.ware
 * @ClassName: WareApplication
 * @Description:
 * @Author: doki
 * @Date: 2022/4/10 13:55
 */

@EnableFeignClients
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan("com.harukaze.shop.ware.dao")
@SpringBootApplication
public class WareApplication {
    public static void main(String[] args) {
        SpringApplication.run(WareApplication.class, args);
    }
}
