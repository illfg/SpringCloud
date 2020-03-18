package org.yuanqi.customerorder81;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerOrder81Application {

    public static void main(String[] args) {
        SpringApplication.run(CustomerOrder81Application.class, args);
    }

}
