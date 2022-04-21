package com.harukaze.common.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @PackageName: com.harukaze.common.to
 * @ClassName: SkuReductionTo
 * @Description:
 * @Author: doki
 * @Date: 2022/4/20 16:36
 */

@Data
public class SkuReductionTo {

    private Long skuId;
    private Integer fullCount;
    private BigDecimal discount;
    private Integer countStatus;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private Integer priceStatus;
    private List<MemberPrice> memberPrice;
}
