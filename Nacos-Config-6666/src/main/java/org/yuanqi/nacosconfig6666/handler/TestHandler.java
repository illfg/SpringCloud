package org.yuanqi.nacosconfig6666.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope
public class TestHandler {

    @Value("${config.info}")
    String info;

    @RequestMapping("/getConfig")
    @ResponseBody
    public String getConfig(){
        return info;
    }
}
