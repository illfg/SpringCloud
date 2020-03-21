package org.yuanqi.gateway9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Gateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway9527Application.class, args);
    }

}
