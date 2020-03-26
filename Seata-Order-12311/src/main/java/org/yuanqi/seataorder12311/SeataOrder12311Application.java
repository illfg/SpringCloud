package org.yuanqi.seataorder12311;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.yuanqi.seataorder12311.mapper.OrderMapper;

@SpringBootApplication
@MapperScan("org.yuanqi.seataorder12311.mapper")
public class SeataOrder12311Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SeataOrder12311Application.class, args);
        OrderMapper bean = context.getBean(OrderMapper.class);
        System.out.println(bean.SeleteOrder(1));
    }

}
