package org.yuanqi.nacosconfig6666;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfig6666Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfig6666Application.class, args);
    }

}
