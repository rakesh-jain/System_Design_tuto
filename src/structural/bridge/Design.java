package structural.bridge;

public class Design implements Manufacture {

    @Override
    public String work(Vehicle vehicle) {
        return vehicle.getModel() + " - Outer design completed.";
    }
}
