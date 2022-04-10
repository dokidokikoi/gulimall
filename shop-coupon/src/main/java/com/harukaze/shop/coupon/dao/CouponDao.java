package com.harukaze.shop.coupon.dao;

import com.harukaze.shop.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 14:05:03
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
