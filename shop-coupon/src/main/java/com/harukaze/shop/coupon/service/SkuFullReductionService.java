package com.harukaze.shop.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.harukaze.common.to.SkuReductionTo;
import com.harukaze.common.utils.PageUtils;
import com.harukaze.shop.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 14:05:03
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo skuReductionTo);
}

