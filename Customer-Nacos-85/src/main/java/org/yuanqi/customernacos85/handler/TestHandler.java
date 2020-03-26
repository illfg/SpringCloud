package org.yuanqi.customernacos85.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Controller
public class TestHandler {

    @Resource
    RestTemplate restTemplate;

    private static final String URL = "http://nacus-payment";

    @RequestMapping("getPayment")
    @ResponseBody
    public String getPayment(){
        return restTemplate.getForObject(URL+"/test",String.class);
    }
}
