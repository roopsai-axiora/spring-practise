package in.roopsai.config;

import in.roopsai.user.Car;
import in.roopsai.user.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.roopsai.user")
public class Config {

    @Bean
    Car benz() {
        return new Car("Benz");
    }

    @Bean
    Car bmw() {
        return new Car("BMW");
    }

    @Bean
    Integer integer() {
        return 1;
    }

    @Bean
    String string() {
        return "Hello World";
    }


}
