package com.harukaze.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @PackageName: com.harukaze.shop.product.to
 * @ClassName: SpuBoundTo
 * @Description:
 * @Author: doki
 * @Date: 2022/4/20 16:22
 */

@Data
public class SpuBoundTo {

    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;
}
