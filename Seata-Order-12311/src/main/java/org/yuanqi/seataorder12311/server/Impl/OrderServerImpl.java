package org.yuanqi.seataorder12311.server.Impl;

import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import org.yuanqi.seataorder12311.entity.Order;
import org.yuanqi.seataorder12311.mapper.OrderMapper;
import org.yuanqi.seataorder12311.server.OrderServer;

import javax.annotation.Resource;

public class OrderServerImpl implements OrderServer {

    @Resource
    private OrderMapper mapper;
    @Resource
    private RestTemplate restTemplate;

    private Logger logger = LoggerFactory.getLogger(OrderServerImpl.class);

    @Override
    @GlobalTransactional(name = "anything",rollbackFor = Exception.class)
    public void OrderCreate(Order order) {
        logger.info("Order creating");
        mapper.InsertOrder(order);

    }

    @Override
    public void OrderUpdate(Order order) {
        mapper.UpdateOrder(order);
    }

    @Override
    public void OrderSelect(int id) {
        mapper.SeleteOrder(id);
    }
}
