package com.harukaze.shop.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.harukaze.common.utils.PageUtils;
import com.harukaze.shop.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 14:44:15
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

