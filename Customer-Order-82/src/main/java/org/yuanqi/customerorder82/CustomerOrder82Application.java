package org.yuanqi.customerorder82;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerOrder82Application {

    public static void main(String[] args) {
        SpringApplication.run(CustomerOrder82Application.class, args);
    }

}
