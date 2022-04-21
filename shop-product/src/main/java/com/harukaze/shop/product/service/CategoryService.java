package com.harukaze.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.harukaze.common.utils.PageUtils;
import com.harukaze.shop.product.entity.CategoryEntity;
import com.harukaze.shop.product.vo.CategoryVo;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 12:23:32
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryVo> listWithTree();

    void removeMenuByIds(List<CategoryVo> list);

    Long[] findCatelogPath(Long catelogId);

    void updateCascade(CategoryEntity categoryEntity);
}

