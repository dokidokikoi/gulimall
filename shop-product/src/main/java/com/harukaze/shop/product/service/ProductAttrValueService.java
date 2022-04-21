package com.harukaze.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.harukaze.common.utils.PageUtils;
import com.harukaze.shop.product.entity.ProductAttrValueEntity;

import java.util.List;
import java.util.Map;

/**
 * spu属性值
 *
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 12:23:32
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<ProductAttrValueEntity> baseAttrListForSpu(Long spuId);

    void updateSpuAttr(Long spuId, List<ProductAttrValueEntity> entities);
}

