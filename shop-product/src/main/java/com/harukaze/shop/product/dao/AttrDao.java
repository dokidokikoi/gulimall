package com.harukaze.shop.product.dao;

import com.harukaze.shop.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 12:23:32
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
