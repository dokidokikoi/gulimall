package com.harukaze.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.harukaze.common.utils.PageUtils;
import com.harukaze.shop.product.entity.AttrAttrgroupRelationEntity;
import com.harukaze.shop.product.vo.AttrGroupRelationVo;

import java.util.List;
import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 12:23:33
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void removeBatchRelation(List<AttrAttrgroupRelationEntity> collect);

    void saveBatch(List<AttrGroupRelationVo> vos);
}

