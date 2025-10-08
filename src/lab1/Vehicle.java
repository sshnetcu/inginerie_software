package lab1;

public class Vehicle {
    public String name;

    Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move() {
        System.out.println("Moving " + name);
    }
}
