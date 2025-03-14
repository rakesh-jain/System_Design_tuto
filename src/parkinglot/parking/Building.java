package parkinglot.parking;

import parkinglot.vehicle.*;

import java.util.*;

import static parkinglot.vehicle.VehicleType.BIKE;
import static parkinglot.vehicle.VehicleType.HEAVY_VEHICLE;

public class Building {
    private static final int AVG_SPOTS = 40;
    private int buildingNum;
    private int floors;
    private int carCount;
    private int bikeCount;
    private int heavyVehicle;
    private int[] floorsDiv;
    private int start, end;
    private Map<String, List<ParkingSpot>> parkingSpotsPerFloor;

    public Building(int buildingNum, int floors) {
        this.buildingNum = buildingNum;
        this.floors = floors;
        parkingSpotsPerFloor = new LinkedHashMap<>();

        // Add floors
        parkingSpotsPerFloor.put("G-ground floor", new ArrayList<>());

        for (int i = 1; i <= floors; i++) {
            parkingSpotsPerFloor.put(getFloorName(i), new ArrayList<>());
        }

        // Divide floors: heavy vehicles, cars, bikes
        floorsDiv = new int[]{floors / 3, floors / 3, floors - ((floors / 3) * 2)};
        int bikes = AVG_SPOTS * 4;
        int cars = AVG_SPOTS * 2;
        int heavyVehicles = AVG_SPOTS;
        int vip = AVG_SPOTS / 2;

        // Fill spots based on floor type
        fillSpots(cars, 0, 0, VehicleType.VIP);
        fillSpots(heavyVehicles, 1, floorsDiv[0], HEAVY_VEHICLE);
        fillSpots(cars, floorsDiv[0] + 1, floorsDiv[0] + floorsDiv[1], VehicleType.CAR);
        fillSpots(bikes, floorsDiv[0] + floorsDiv[1] + 1, floors, BIKE);
    }

    public void fillSpots(int vehicleCount, int start, int end, VehicleType type) {
        for (int i = start; i <= end; i++) {
            String floorName = getFloorName(i);
            List<ParkingSpot> spots = parkingSpotsPerFloor.get(floorName);
            for (int j = 1; j <= vehicleCount; j++) {
                spots.add(new ParkingSpot(j, type));
            }
        }
    }

    private String getFloorName(int floor) {
        if (floor == 0) return "G-ground floor";
        if (floor == 1) return "1st floor";
        if (floor == 2) return "2nd floor";
        if (floor == 3) return "3rd floor";
        return floor + "th floor";
    }

    private void setSE(Vehicle vehicle, boolean park, boolean avail) {
        int startFloor, endFloor;
        switch (vehicle.getVehicleType()) {
            case HEAVY_VEHICLE -> {
                startFloor = 1;
                endFloor = floorsDiv[0];
                if (!avail) break;
                if (park) {
                    heavyVehicle++;
                } else {
                    heavyVehicle--;
                }
            }
            case CAR -> {
                startFloor = floorsDiv[0] + 1;
                endFloor = floorsDiv[0] + floorsDiv[1];
                if (avail) break;
                if (park) {
                    carCount++;
                } else {
                    carCount--;
                }
            }
            case BIKE -> {
                startFloor = floorsDiv[0] + floorsDiv[1] + 1;
                endFloor = floors;
                if (!avail) break;
                if (park) {
                    bikeCount++;
                } else {
                    bikeCount--;
                }
            }
            case VIP -> {
                startFloor = 0;
                endFloor = 0;
                if (!avail) break;
                if (park) {
                    carCount++;
                } else {
                    carCount--;
                }
            }
            default -> {
                return;
            }
        }
        start = startFloor;
        end = endFloor;
    }


    public synchronized boolean park(Vehicle vehicle) {
        setSE(vehicle, true, false);
        System.out.println("Parking " + vehicle.getVehicleType() + " from floor " + start + " to " + end);

        // Try to park the vehicle in the correct floor range
        for (int i = start; i <= end; i++) {
            String floorKey = getFloorName(i);
            List<ParkingSpot> spots = parkingSpotsPerFloor.get(floorKey);

            if (spots == null) continue;

            for (int j = 0; j < spots.size(); j++) {
                ParkingSpot spot = spots.get(j);
                System.out.println("Checking floor: " + floorKey +
                        " \n Spot: " + spot.getSpotNumber() +
                        " \n Available: " + spot.isAvailable() +
                        " \n Type: " + spot.getVehicleType());

                if (spot.isAvailable() && spot.getVehicleType() == vehicle.getVehicleType()) {
                    spot.parking(vehicle);
                    System.out.println(vehicle.getVehicleType() + " parked at " + floorKey + " in spot " + spot.getSpotNumber());
                    return true;
                }
            }
        }
        return false;
    }

    public synchronized boolean unpark(Vehicle vehicle) {
        setSE(vehicle, false, false);
        // Try to unpark the vehicle from the correct floor range
        for (int i = start; i <= end; i++) {
            String floorKey = getFloorName(i);
            List<ParkingSpot> spots = parkingSpotsPerFloor.get(floorKey);

            for (int j = 0; j < spots.size(); j++) {
                ParkingSpot spot = spots.get(j);
                if (!spot.isAvailable() && spot.getVehicle().equals(vehicle)) {
                    spot.unParking(vehicle); // Mark the spot as available
                    spots.set(j, spot); // Reflect back to the list
                    parkingSpotsPerFloor.put(floorKey, spots); // Update the map

                    System.out.println(vehicle.getVehicleType() + " unparked from " + floorKey + " from spot " + spot.getSpotNumber());
                    return true;
                }
            }
        }
        return false;
    }

    //display available spots per floor
    public void availableSpotsPerFloor(Vehicle vehicle) {
        setSE(vehicle, true, true); // Assuming this is required for some state setup

        for (int i = start; i <= end; i++) { // Use public start and end directly
            String floor = getFloorName(i);
            List<ParkingSpot> list = parkingSpotsPerFloor.get(floor);

            System.out.println("Available spots on floor " + floor + ":");
            boolean available = false;

            for (ParkingSpot p : list) {
                if (p.getVehicle() == null && vehicle.getVehicleType().equals(p.getVehicleType())) {
                    System.out.println("  - Spot: " + p.getSpotNumber() + " | Available: " + p.isAvailable());
                    available = true;
                }
            }

            if (!available) {
                System.out.println("  No available spots for this vehicle type.");
            }

            System.out.println();
        }
    }

    public void filledSpotsPerFloor(Vehicle vehicle) {
        setSE(vehicle, true, true); // Assuming this is required for some state setup

        for (int i = start; i <= end; i++) { // Use public start and end directly
            String floor = getFloorName(i);
            List<ParkingSpot> list = parkingSpotsPerFloor.get(floor);

            System.out.println("Available spots on " + floor + ":");
            boolean available = false;

            for (ParkingSpot p : list) {
                if (p.getVehicle() != null && vehicle.getVehicleType().equals(p.getVehicleType())) {
                    System.out.println("  - Spot: " + p.getSpotNumber() + " | Available: " + p.isAvailable());
                    available = true;
                }
            }

            if (!available) {
                System.out.println("No available spots for this vehicle type.");
            }
            System.out.println();
        }
    }

    public int getCarCount() {
        return carCount;
    }

    public int getBikeCount() {
        return bikeCount;
    }

    public int getHeavyVehicle() {
        return heavyVehicle;
    }

    //  testing
//    public static void main(String[] args) {
//        Building build = new Building(12, 3);
//        Building building = new Building(12, 10);
//
//        Vehicle car = new Car("124xy", VehicleType.VIP);
//        Vehicle bike = new Bike("234ui", VehicleType.BIKE);
//        Vehicle heavyVehicle = new Truck("9e93", HEAVY_VEHICLE);
//
//        build.park(car);
//        build.park(bike);
//        build.park(heavyVehicle);
//       // build.unpark(car);
//       // build.availableSpotsPerFloor(bike);
//        build.filledSpotsPerFloor(bike);
////        for (Map.Entry<String, List<ParkingSpot>> map : build.parkingSpotsPerFloor.entrySet()) {
////            String floor = map.getKey();
////            List<ParkingSpot> spot = map.getValue();
////            System.out.print(floor + "-> {");
////
////            for (ParkingSpot p : spot) {
////                System.out.println(p.getVehicle());
////                System.out.print("[" + p.getSpotNumber() + ":" + p.getVehicleType() + "]");
////            }
////            System.out.print("}");
////            System.out.println("\n");
////        }
//    }
}
