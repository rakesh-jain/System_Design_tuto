package structural.bridge;

public class Assemble implements Manufacture {
    @Override
    public String work(Vehicle vehicle) {
        return vehicle.getModel() + " - Assembling completed.";
    }
}
