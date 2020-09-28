package com.zcw.gulimall.member.feign;

import com.zcw.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author changwei.zheng
 * @date 2020/9/28 11:07
 * @describe
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")//注意写全优惠券类上还有映射//注意我们这个地方不熟控制层，所以这个请求映射请求的不是我们服务器上的东西，而是nacos注册中心的
    public R membercoupons();//得到一个R对象
}
