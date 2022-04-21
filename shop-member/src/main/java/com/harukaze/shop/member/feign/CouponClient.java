package com.harukaze.shop.member.feign;

import com.harukaze.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @PackageName: com.harukaze.shop.member.feign
 * @ClassName: CouponClient
 * @Description:
 * @Author: doki
 * @Date: 2022/4/10 18:01
 */

@FeignClient("shop-coupon")
public interface CouponClient {

    @RequestMapping("/coupon/coupon/member/list")
    R membercoupon();
}
