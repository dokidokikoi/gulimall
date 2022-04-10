package com.harukaze.shop.product.dao;

import com.harukaze.shop.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 12:23:33
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
