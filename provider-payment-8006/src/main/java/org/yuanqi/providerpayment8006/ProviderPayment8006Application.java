package org.yuanqi.providerpayment8006;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderPayment8006Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderPayment8006Application.class, args);
    }

}
