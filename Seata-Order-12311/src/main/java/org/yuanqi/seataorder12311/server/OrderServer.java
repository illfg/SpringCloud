package org.yuanqi.seataorder12311.server;

import org.yuanqi.seataorder12311.entity.Order;

public interface OrderServer {

     void OrderCreate(Order order);

     void OrderUpdate(Order order);
     void OrderSelect(int id);
}
