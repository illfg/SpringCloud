package org.yuanqi.providerpayment8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderPayment8003Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderPayment8003Application.class, args);
    }

}
