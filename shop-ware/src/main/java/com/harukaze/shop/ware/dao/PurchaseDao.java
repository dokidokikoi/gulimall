package com.harukaze.shop.ware.dao;

import com.harukaze.shop.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 14:46:07
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
