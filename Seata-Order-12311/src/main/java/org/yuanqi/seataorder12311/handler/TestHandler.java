package org.yuanqi.seataorder12311.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestHandler {

    @Value("${config.info}")
    String url;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return url;
    }
}
