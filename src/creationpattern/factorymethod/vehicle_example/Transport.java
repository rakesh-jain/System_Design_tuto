package creationpattern.factorymethod.vehicle_example;

import java.util.Map;

public interface Transport {
    public void goods(Map<String, Integer> items);
    public void shipperDetails(Map<String, String> details);
}
