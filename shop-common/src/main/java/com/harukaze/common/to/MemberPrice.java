package com.harukaze.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @PackageName: com.harukaze.common.to
 * @ClassName: MemberPrice
 * @Description:
 * @Author: doki
 * @Date: 2022/4/20 16:39
 */

@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;
}
