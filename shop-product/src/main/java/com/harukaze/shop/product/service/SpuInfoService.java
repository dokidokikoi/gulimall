package com.harukaze.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.harukaze.common.utils.PageUtils;
import com.harukaze.shop.product.entity.SpuInfoEntity;
import com.harukaze.shop.product.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 12:23:32
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity spuInfoEntity);

    PageUtils queryPageByCondition(Map<String, Object> params);
}

