package creationpattern.factorymethod.vehicle_example;

public class RoadLogistic implements Logistic {
    
    @Override
    public Transport createLogistic() {
        System.out.println("Road Logistic");
        return new Truck();
    }
}
