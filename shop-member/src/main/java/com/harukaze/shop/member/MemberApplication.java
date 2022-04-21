package com.harukaze.shop.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PackageName: com.harukaze.shop.member
 * @ClassName: MemberApplication
 * @Description:
 * @Author: doki
 * @Date: 2022/4/10 13:54
 */

@EnableFeignClients(basePackages = "com.harukaze.shop.member.feign")
@MapperScan("com.harukaze.shop.member.dao")
@SpringBootApplication
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }
}
