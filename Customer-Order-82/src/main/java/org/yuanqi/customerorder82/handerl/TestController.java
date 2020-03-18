package org.yuanqi.customerorder82.handerl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Controller
public class TestController {

    private final static String INVOKE_URL = "http://payment-8004";

    @Resource
    RestTemplate restTemplate;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return restTemplate.getForObject(INVOKE_URL+"/test",String.class);
    }
}
