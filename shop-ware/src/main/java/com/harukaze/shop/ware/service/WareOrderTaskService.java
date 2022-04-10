package com.harukaze.shop.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.harukaze.common.utils.PageUtils;
import com.harukaze.shop.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 14:46:07
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

