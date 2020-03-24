package org.yuanqi.customerfeign83.handler;


import entity.CommonResult;
import entity.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yuanqi.customerfeign83.service.PaymentFeignService;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    PaymentFeignService paymentFeignService;


    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("feign here ");
        log.info("feign home");
         return paymentFeignService.test();
    }

    private static Logger log = LoggerFactory.getLogger(TestController.class);

}
