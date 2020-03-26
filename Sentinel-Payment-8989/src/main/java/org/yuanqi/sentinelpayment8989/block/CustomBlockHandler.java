package org.yuanqi.sentinelpayment8989.block;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class CustomBlockHandler {
    public static String test4Handler(BlockException exception){
        return "custom handler for intenal error!";
    }
}
