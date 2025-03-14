package parkinglot.parking;

import parkinglot.vehicle.Vehicle;
import parkinglot.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ParkadeImpl implements ParkingServices {

    public ParkadeImpl(Building building) {
        this.building = building;
    }

    private Building building;


    @Override
    public synchronized void availables(Vehicle vehicle) {
        building.availableSpotsPerFloor(vehicle);
    }

    @Override
    public synchronized void parking(Vehicle vehicle) {
        building.park(vehicle);
    }

    @Override
    public synchronized void unparking(Vehicle vehicle) {
        building.unpark(vehicle);
    }

    @Override
    public synchronized void listAllParked(Vehicle vehicle) {
        building.filledSpotsPerFloor(vehicle);
    }

    @Override
    public synchronized void listAllAvailableParking(Vehicle vehicle) {
        building.availableSpotsPerFloor(vehicle);
    }
}

