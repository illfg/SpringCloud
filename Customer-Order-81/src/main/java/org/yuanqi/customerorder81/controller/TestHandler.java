package org.yuanqi.customerorder81.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Controller
public class TestHandler {

    @Resource
    RestTemplate restTemplate;

    private final static String INVOKE_URL= "http://payment-8003";

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return restTemplate.getForObject(INVOKE_URL+"/test",String.class);
    }
}
