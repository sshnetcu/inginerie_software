package lab1;

public class Car extends Vehicle {
    public String modelNumber;

    Car(String name, String modelNumber) {
        super(name);
        this.modelNumber = modelNumber;
    }

    @Override
    public String getName() {
        return super.getName() + " " + modelNumber;
    }
}
