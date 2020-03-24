package org.yuanqi.streamprovider8801;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StreamProvider8801Application {

    public static void main(String[] args) {
        SpringApplication.run(StreamProvider8801Application.class, args);
    }

}
