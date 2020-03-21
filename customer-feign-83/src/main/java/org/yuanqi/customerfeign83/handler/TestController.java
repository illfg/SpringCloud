package org.yuanqi.customerfeign83.handler;


import entity.CommonResult;
import entity.Payment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yuanqi.customerfeign83.service.PaymentFeignService;

import javax.annotation.Resource;

@Controller
public class TestController {

    @Resource
    PaymentFeignService paymentFeignService;


    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("feign here ");
         return paymentFeignService.test();
    }
}
