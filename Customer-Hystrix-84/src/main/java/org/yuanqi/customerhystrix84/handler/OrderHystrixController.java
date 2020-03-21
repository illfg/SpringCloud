package org.yuanqi.customerhystrix84.handler;


import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yuanqi.customerhystrix84.service.PaymentService;

import javax.annotation.Resource;

@Controller
@DefaultProperties(defaultFallback = "payment_dafualtHandler",commandProperties = {
        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
})
public class OrderHystrixController {

    @Resource
    PaymentService paymentService;

    @RequestMapping("customer/getOK")
    @ResponseBody
    public String getOk(){
        return paymentService.ok();
    }

//    @HystrixCommand(fallbackMethod = "payment_TimeoutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
//    })
    @HystrixCommand
    @RequestMapping("customer/timeout")
    @ResponseBody
    public String getTimeout(){
        return paymentService.timeout();
    }

    public String payment_TimeoutHandler(){
        return "oh, hava something internal error,try later!";
    }

    public String payment_dafualtHandler(){
        return "here is default payment handler";
    }
}
