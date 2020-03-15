package main;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan("main/mapper")
@SpringBootApplication
@EnableEurekaClient
public class PaymentStarter8002 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PaymentStarter8002.class, args);

    }
}
