package com.harukaze.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.harukaze.common.utils.PageUtils;
import com.harukaze.shop.product.entity.AttrEntity;
import com.harukaze.shop.product.entity.AttrGroupEntity;
import com.harukaze.shop.product.vo.AttrGroupRelationVo;
import com.harukaze.shop.product.vo.AttrRespVo;
import com.harukaze.shop.product.vo.AttrVo;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 12:23:32
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attrVo);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attrVo);

    List<AttrEntity> getRelationAttr(Long attrgroupId);

    void deleteRelation(AttrGroupRelationVo[] attrGroupRelationVos);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);
}

