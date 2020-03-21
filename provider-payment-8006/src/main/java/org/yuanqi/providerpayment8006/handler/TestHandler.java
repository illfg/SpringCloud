package org.yuanqi.providerpayment8006.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestHandler {

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "success2";
    }
}
