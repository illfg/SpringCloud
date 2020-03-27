package org.yuanqi.customerfeign83;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CustomerFeign83Application {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFeign83Application.class, args);
    }
    //UPDATE t_repository SET used = used + #{count},...WHERE ///
}
