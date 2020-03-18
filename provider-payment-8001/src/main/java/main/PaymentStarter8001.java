package main;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan("main/mapper")
@SpringBootApplication
@EnableEurekaClient

public class PaymentStarter8001 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PaymentStarter8001.class, args);

    }
}
