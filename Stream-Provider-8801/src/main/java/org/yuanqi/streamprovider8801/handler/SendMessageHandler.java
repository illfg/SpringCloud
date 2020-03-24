package org.yuanqi.streamprovider8801.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yuanqi.streamprovider8801.service.IMessageProvider;

import javax.annotation.Resource;

@Controller
public class SendMessageHandler {

    @Resource
    private IMessageProvider provider;

    @RequestMapping(value = "/sendMessage")
    @ResponseBody
    public String sendMessage(){
        return provider.send();
    }
}
