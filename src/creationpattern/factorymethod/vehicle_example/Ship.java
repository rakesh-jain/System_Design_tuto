package creationpattern.factorymethod.vehicle_example;

import java.util.Map;

public class Ship implements Transport {
    public Ship() {
        System.out.println("Transporting via ship");
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
