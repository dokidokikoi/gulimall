package com.harukaze.shop.coupon.dao;

import com.harukaze.shop.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 14:05:03
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
