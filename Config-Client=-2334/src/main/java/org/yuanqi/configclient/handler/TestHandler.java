package org.yuanqi.configclient.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope
public class TestHandler {

    @Value("${config}")
    String config;
    @RequestMapping("getConfig")
    @ResponseBody
    public String test(){
        return config;
    }
}
