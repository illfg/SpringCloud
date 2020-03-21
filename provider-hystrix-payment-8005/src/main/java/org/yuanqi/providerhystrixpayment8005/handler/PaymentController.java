package org.yuanqi.providerhystrixpayment8005.handler;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yuanqi.providerhystrixpayment8005.service.PaymentService;

import javax.annotation.Resource;


@Controller
public class PaymentController {

    @Resource
    PaymentService paymentService;


    @RequestMapping("ok")
    @ResponseBody
    public String ok(){
        return paymentService.payment_OK();
    }

    @RequestMapping("timeout")
    @ResponseBody
    public String timeout(){
        return paymentService.payment_Timeout();
    }

    @RequestMapping("circuit/breaker")
    @ResponseBody
    public String breaker(int id){
        return paymentService.paymentCircuitBreaker(id);
    }
}
