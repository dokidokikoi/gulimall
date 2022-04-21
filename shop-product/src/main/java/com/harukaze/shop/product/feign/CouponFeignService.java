package com.harukaze.shop.product.feign;

import com.harukaze.common.to.SkuReductionTo;
import com.harukaze.common.to.SpuBoundTo;
import com.harukaze.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("shop-coupon")
public interface CouponFeignService {


    @PostMapping("coupon/spubounds/save")
    R saveSpuBounds(@RequestBody SpuBoundTo spuBoundTo);

    @PostMapping("coupon/skufullreduction/saveinfo")
    R saveSkuReduction(@RequestBody SkuReductionTo skuReductionTo);
}
