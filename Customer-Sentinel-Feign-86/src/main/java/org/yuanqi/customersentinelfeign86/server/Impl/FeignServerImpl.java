package org.yuanqi.customersentinelfeign86.server.Impl;

import org.springframework.stereotype.Component;
import org.yuanqi.customersentinelfeign86.server.FeignServer;

@Component
public class FeignServerImpl implements FeignServer {
    @Override
    public String test() {
        return "come errer here , maybe you can try later";
    }
}
