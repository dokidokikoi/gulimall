package com.harukaze.shop.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.harukaze.shop.product.entity.SpuInfoEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.harukaze.common.utils.PageUtils;
import com.harukaze.common.utils.Query;

import com.harukaze.shop.product.dao.SkuInfoDao;
import com.harukaze.shop.product.entity.SkuInfoEntity;
import com.harukaze.shop.product.service.SkuInfoService;
import org.springframework.util.StringUtils;


@Service("skuInfoService")
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoDao, SkuInfoEntity> implements SkuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuInfoEntity> page = this.page(
                new Query<SkuInfoEntity>().getPage(params),
                new QueryWrapper<SkuInfoEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void saveSkuInfo(SkuInfoEntity skuInfoEntity) {
        this.baseMapper.insert(skuInfoEntity);
    }

    @Override
    public PageUtils queryPageByCondition(Map<String, Object> params) {
        LambdaQueryWrapper<SkuInfoEntity> wrapper = new LambdaQueryWrapper<>();
        String key = (String) params.get("key");
        String catelogId = (String) params.get("catelogId");
        String brandId = (String) params.get("brandId");
        String min = (String) params.get("min");
        String max = (String) params.get("max");

        if (!StringUtils.isEmpty(key)) {
            wrapper.and(w -> {
                w.eq(SkuInfoEntity::getSkuId, key).or().like(SkuInfoEntity::getSkuName, key);
            });
        }

        if (!StringUtils.isEmpty(catelogId) && !"0".equals(catelogId)) {
            wrapper.eq(SkuInfoEntity::getCatalogId, catelogId);
        }
        if (!StringUtils.isEmpty(brandId) && !"0".equals(brandId)) {
            wrapper.eq(SkuInfoEntity::getBrandId, brandId);
        }
        if (!StringUtils.isEmpty(min) && !StringUtils.isEmpty(max)) {
            try {
                if (new BigDecimal(max).compareTo(new BigDecimal(0)) > 0) {
                    wrapper.le(SkuInfoEntity::getPrice, max).ge(SkuInfoEntity::getPrice, min);
                }
            } catch (Exception e) {

            }

        }

        IPage<SkuInfoEntity> page = this.page(
                new Query<SkuInfoEntity>().getPage(params),
                wrapper
        );
        return new PageUtils(page);
    }

}