package com.zcw.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zcw.gulimall.coupon.entity.CouponEntity;
import com.zcw.gulimall.coupon.service.CouponService;
import com.zcw.common.utils.PageUtils;
import com.zcw.common.utils.R;

/**
 * 优惠券信息
 *
 * @author zcw
 * @email 1269283796@qq.com
 * @date 2020-09-25 13:57:14
 */
@RestController
@RequestMapping("coupon/coupon")
@RefreshScope
public class CouponController {
  @Autowired private CouponService couponService;

  @Value("${user.age}")
  Integer age;

  @RequestMapping("/getAge")
  public R getAge() {
    return R.ok(age + "");
  }

  @RequestMapping("/member/list")
  public R membercoupons() { // 全系统的所有返回都返回R
    // 应该去数据库查用户对于的优惠券，但这个我们简化了，不去数据库查了，构造了一个优惠券给他返回
    CouponEntity couponEntity = new CouponEntity();
    couponEntity.setCouponName("满100-10"); // 优惠券的名字
    return R.ok().put("coupons", Arrays.asList(couponEntity));
  }
  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("coupon:coupon:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = couponService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("coupon:coupon:info")
  public R info(@PathVariable("id") Long id) {
    CouponEntity coupon = couponService.getById(id);

    return R.ok().put("coupon", coupon);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("coupon:coupon:save")
  public R save(@RequestBody CouponEntity coupon) {
    couponService.save(coupon);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("coupon:coupon:update")
  public R update(@RequestBody CouponEntity coupon) {
    couponService.updateById(coupon);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("${moduleNamez}:coupon:delete")
  public R delete(@RequestBody Long[] ids) {
    couponService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
