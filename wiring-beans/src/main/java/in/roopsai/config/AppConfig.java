package in.roopsai.config;

import in.roopsai.driver.Driver;
import in.roopsai.car.Car;
import in.roopsai.parrot.Parrot;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.roopsai")
public class AppConfig {

    @Bean
    public Car bmw() {
        var car = new Car();
        car.setName("bmw");
        return car;
    }

    @Bean
    public Car benz() {
        var car = new Car();
        car.setName("benz");
        return car;
    }

    @Bean
    public Driver john() {
        var driver = new Driver();
        driver.setCar(bmw()); // wiring
        return driver;
    }

    @Bean
    public Parrot kiki() {
        var parrot = new Parrot();
        parrot.setName("kiki");
        return parrot;
    }

    @Bean
    public Parrot kurt() {
        var parrot = new Parrot();
        parrot.setName("kurt");
        return parrot;
    }

    @Bean
    public Driver doe(@Qualifier("benz") Car benz) { // autowiring
        var driver = new Driver();
        driver.setCar(benz);
        return driver;
    }
}
