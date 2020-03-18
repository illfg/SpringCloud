package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableEurekaClient
public class CustomerStarter {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CustomerStarter.class, args);
    }
}
