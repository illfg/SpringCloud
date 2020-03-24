package org.yuanqi.configclient2335;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClient2335Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient2335Application.class, args);
    }

}
