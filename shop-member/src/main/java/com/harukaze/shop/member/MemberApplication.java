package com.harukaze.shop.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @PackageName: com.harukaze.shop.member
 * @ClassName: MemberApplication
 * @Description:
 * @Author: doki
 * @Date: 2022/4/10 13:54
 */

@MapperScan("com.harukaze.shop.member.dao")
@SpringBootApplication
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }
}
