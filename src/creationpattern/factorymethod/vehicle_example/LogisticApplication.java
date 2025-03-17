package creationpattern.factorymethod.vehicle_example;

import java.util.Map;

public class LogisticApplication {
    public static void main(String[] args) {
        Logistic logistic = new RoadLogistic();
        Transport  truck = logistic.createLogistic();
        Map<String, Integer> items = Map.of("Apple",7328,"Banana",7390);
        truck.goods(items);
        Map<String, String> details = Map.of("Name","Govindha","age","45");
        truck.shipperDetails(details);
    }
}
