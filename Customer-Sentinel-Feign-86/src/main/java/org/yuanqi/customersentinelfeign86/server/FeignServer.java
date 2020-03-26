package org.yuanqi.customersentinelfeign86.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yuanqi.customersentinelfeign86.server.Impl.FeignServerImpl;

@FeignClient(value = "nacus-payment", fallback = FeignServerImpl.class)
public interface FeignServer {

    @RequestMapping("test")
    @ResponseBody
    public String test();

}
