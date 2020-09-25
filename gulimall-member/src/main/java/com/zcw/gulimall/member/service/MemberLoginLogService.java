package com.zcw.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcw.common.utils.PageUtils;
import com.zcw.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author zcw
 * @email 1269283796@qq.com
 * @date 2020-09-25 13:49:27
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

