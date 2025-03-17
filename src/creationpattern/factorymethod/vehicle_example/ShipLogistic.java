package creationpattern.factorymethod.vehicle_example;

public class ShipLogistic implements Logistic {

    @Override
    public Transport createLogistic() {
        System.out.println("Ship Logistic");
        return new Ship();
    }
}
