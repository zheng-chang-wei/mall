package com.zcw.gulimall.member.dao;

import com.zcw.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zcw
 * @email 1269283796@qq.com
 * @date 2020-09-25 13:49:27
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}