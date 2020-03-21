package org.yuanqi.hystrix_dashbroad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashbroadApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashbroadApplication.class, args);
    }

}
