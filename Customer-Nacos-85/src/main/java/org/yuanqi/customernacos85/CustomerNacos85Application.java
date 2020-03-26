package org.yuanqi.customernacos85;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerNacos85Application {

    public static void main(String[] args) {
        SpringApplication.run(CustomerNacos85Application.class, args);
    }

}
