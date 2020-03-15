package main;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import main.service.PaymentService;
import main.service.impl.PaymentServiceImpl;

@MapperScan("main/mapper")
@SpringBootApplication
public class ServiceStarter {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ServiceStarter.class, args);
        PaymentService userService = context.getBean(PaymentServiceImpl.class);

    }
}
