package com.harukaze.shop.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.harukaze.common.utils.PageUtils;
import com.harukaze.shop.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 14:46:07
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

