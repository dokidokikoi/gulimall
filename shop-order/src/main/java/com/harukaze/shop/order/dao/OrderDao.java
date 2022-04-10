package com.harukaze.shop.order.dao;

import com.harukaze.shop.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 14:44:15
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
