package ribbonRule;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BalanceRule {

    @Bean
    RandomRule randomRule(){
        return new RandomRule();
    }
}
