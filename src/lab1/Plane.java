package lab1;

public class Plane extends Vehicle {
    public String companyName;

    Plane(String name, String companyName) {
        super(name);
        this.companyName = companyName;
    }

    public String getName() {
        return super.getName() + " " + companyName;
    }

    public void move() {
        System.out.println("TODO: implement flying logic");
    }
}
