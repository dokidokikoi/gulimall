package com.harukaze.shop.member.dao;

import com.harukaze.shop.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 14:37:12
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
