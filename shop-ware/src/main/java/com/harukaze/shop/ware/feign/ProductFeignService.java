package com.harukaze.shop.ware.feign;

import com.harukaze.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @PackageName: com.harukaze.shop.ware.feign
 * @ClassName: ProductFeignService
 * @Description:
 * @Author: doki
 * @Date: 2022/4/21 0:21
 */

@FeignClient("shop-product")
public interface ProductFeignService {

    @RequestMapping("product/skuinfo/info/{skuId}")
    R info(@PathVariable("skuId") Long skuId);
}
