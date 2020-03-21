package org.yuanqi.customerhystrix84.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@FeignClient(value = "payment-8005")
public interface PaymentService {
    
    @RequestMapping("ok")
    @ResponseBody
    String ok();

    @RequestMapping("timeout")
    @ResponseBody
    String timeout();
}
