package in.roopsai.car;

public class Car {

    private String name;

    public String move() {
        return "Driving a car";
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
