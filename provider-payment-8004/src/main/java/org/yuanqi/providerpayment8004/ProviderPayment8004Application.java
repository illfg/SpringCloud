package org.yuanqi.providerpayment8004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderPayment8004Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderPayment8004Application.class, args);
    }

}
