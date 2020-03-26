package org.yuanqi.sentinelpayment8989.handler;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yuanqi.sentinelpayment8989.block.CustomBlockHandler;

@Controller
public class TestHandler {


    @RequestMapping("test1")
    @ResponseBody
    public String test1(){
        return "test1";
    }

    @RequestMapping("test2")
    @ResponseBody
    public String test2(){
        return "test2";
    }

    @RequestMapping("/test3")
    @ResponseBody
    @SentinelResource(value = "test3",blockHandler = "test2Handler")
    public String test2(@RequestParam(value = "p1",required = false) String p1){
        return "test3";
    }

    public String test2Handler(String p1, BlockException exception){

        return "intenal error!";
    }


    //customerBlockHandler
    @RequestMapping("test4")
    @ResponseBody
    @SentinelResource(value = "test4",blockHandlerClass = CustomBlockHandler.class,blockHandler = "test4Handler")
    public String test4(){
        return "test4";
    }
}
