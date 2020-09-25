package com.zcw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcw.common.utils.PageUtils;
import com.zcw.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author zcw
 * @email 1269283796@qq.com
 * @date 2020-09-25 13:57:14
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

