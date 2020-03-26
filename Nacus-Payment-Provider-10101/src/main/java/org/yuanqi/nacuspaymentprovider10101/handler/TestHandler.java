package org.yuanqi.nacuspaymentprovider10101.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestHandler {

    @Value("${server.port}")
    String port;

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "payment test here" + port;
    }
}
