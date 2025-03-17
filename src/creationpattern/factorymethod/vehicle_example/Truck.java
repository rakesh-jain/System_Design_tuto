package creationpattern.factorymethod.vehicle_example;

import java.util.Map;

public class Truck implements Transport {

    public Truck() {
        System.out.println("Transporting via Truck");
    }

    @Override
    public void goods(Map<String, Integer> items) {
        for (Map.Entry<String, Integer> map : items.entrySet()) {
            System.out.println("item: " + map.getKey() + "\n count:" + map.getValue());
        }
    }

    @Override
    public void shipperDetails(Map<String, String> details) {
        for (Map.Entry<String, String> de : details.entrySet()) {
            System.out.println(de.getKey() + " " + de.getValue());
        }
    }
}
