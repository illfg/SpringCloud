package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.ConfigurableApplicationContext;
import ribbonRule.BalanceRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "payment",configuration = BalanceRule.class)
public class CustomerStarter {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CustomerStarter.class, args);
    }
}
