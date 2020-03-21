package org.yuanqi.customerfeign83.service;


import entity.CommonResult;
import entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@FeignClient("payment-8004")
public interface PaymentFeignService {


    @RequestMapping("test")
    @ResponseBody
    String test();
}
