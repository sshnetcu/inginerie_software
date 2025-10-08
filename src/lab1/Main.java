package lab1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "E3");
        Plane plane = new Plane("Boeing 747", "RyanAir");
        car.move();
        plane.move();
    }
}
