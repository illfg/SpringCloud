package org.yuanqi.providerhystrixpayment8005.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    public String payment_OK(){
        return "线程: "+Thread.currentThread().getName()+" Processing Success";
    }


    @HystrixCommand(fallbackMethod = "payment_TimeoutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    public String payment_Timeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程: "+Thread.currentThread().getName()+" Processing For Timeout";
    }
    public String payment_TimeoutHandler(){
        return "sorry, server is busy right now";
    }


    //服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreakerHandler",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
    })
    public String paymentCircuitBreaker(int id){
        if (id<0){
            int i = 1/0;
        }
        return "success";
    }
    public String paymentCircuitBreakerHandler(int id){
        return "internal server error ,maybe you can try later";
    }
}
