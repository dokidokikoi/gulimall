package com.harukaze.shop.order.dao;

import com.harukaze.shop.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 14:44:15
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
