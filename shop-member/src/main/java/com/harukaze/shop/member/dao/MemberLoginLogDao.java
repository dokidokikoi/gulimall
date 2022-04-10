package com.harukaze.shop.member.dao;

import com.harukaze.shop.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 14:37:11
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
