package in.roopsai.user;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

    private String name;

    private final Car car;

    public User(@Qualifier("bmw") Car car) {
        this.car = car;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @PostConstruct
    public void init() {
        System.out.println("user");
    }

    public Car getCar() {
        return car;
    }
}
