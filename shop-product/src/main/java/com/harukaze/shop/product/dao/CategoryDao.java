package com.harukaze.shop.product.dao;

import com.harukaze.shop.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 12:23:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
