package org.yuanqi.customersentinelfeign86.handler;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.yuanqi.customersentinelfeign86.server.FeignServer;

import javax.annotation.Resource;

@Controller
public class TestHandler {

    @Resource
    private RestTemplate restTemplate;
    private static final String URL = "http://nacus-payment";
    @Resource
    private FeignServer feignServer;

    @RequestMapping("/test")
    @ResponseBody
    @SentinelResource("test")
    public String test(){
//        return "here is 86 server  "+restTemplate.getForObject(URL+"/test",String.class);
        return "here is 86 server  "+feignServer.test();
    }
}
