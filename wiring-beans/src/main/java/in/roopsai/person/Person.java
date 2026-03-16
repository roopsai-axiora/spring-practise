package in.roopsai.person;

import in.roopsai.parrot.Parrot;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;

    private final Parrot parrot;

    public Person(@Qualifier("kurt") Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
