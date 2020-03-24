package org.yuanqi.streamcustomer8990;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StreamCustomer8990Application {

    public static void main(String[] args) {
        SpringApplication.run(StreamCustomer8990Application.class, args);
    }

}
