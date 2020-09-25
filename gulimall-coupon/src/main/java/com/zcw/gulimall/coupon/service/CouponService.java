package com.zcw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcw.common.utils.PageUtils;
import com.zcw.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author zcw
 * @email 1269283796@qq.com
 * @date 2020-09-25 13:57:14
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

