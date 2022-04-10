package com.harukaze.shop.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @PackageName: com.harukaze.shop.ware
 * @ClassName: WareApplication
 * @Description:
 * @Author: doki
 * @Date: 2022/4/10 13:55
 */

@MapperScan("com.harukaze.shop.ware.dao")
@SpringBootApplication
public class WareApplication {
    public static void main(String[] args) {
        SpringApplication.run(WareApplication.class, args);
    }
}
