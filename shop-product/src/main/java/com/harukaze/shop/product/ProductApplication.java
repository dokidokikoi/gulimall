package com.harukaze.shop.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @PackageName: com.harukaze.shop.product
 * @ClassName: ProductApplication
 * @Description:
 * @Author: doki
 * @Date: 2022/4/10 13:30
 */
@SpringBootApplication
@MapperScan("com.harukaze.shop.product.dao")
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
