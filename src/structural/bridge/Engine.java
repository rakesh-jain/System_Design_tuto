package structural.bridge;

public class Engine implements Manufacture {

    @Override
    public String work(Vehicle vehicle) {
        return vehicle.getModel() + " - Engine design completed.";
    }
}
