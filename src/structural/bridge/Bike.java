package structural.bridge;

public class Bike extends Vehicle{

    public Bike(String model, String colour, Manufacture design, Manufacture assemble, Manufacture engine) {
        super(model, colour, design, assemble, engine);
    }
    @Override
    void manufacture() {
        System.out.println("Manufacturing Car: " + getDetails());
        System.out.println(design.work(this));
        System.out.println(assemble.work(this));
        System.out.println(engine.work(this));
    }
}
