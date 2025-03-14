package parkinglot.parking;

import parkinglot.vehicle.Vehicle;
import parkinglot.vehicle.VehicleType;

public class ParkingSpot {
    private int spotNumber;
    private Vehicle parkedVehicle;
    private VehicleType vehicleType;

    public ParkingSpot(int spotNumber, VehicleType vehicleType) {
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
    }

    public synchronized boolean isAvailable() {
        return parkedVehicle == null;
    }

    public synchronized void parking(Vehicle vehicle) {
        if (isAvailable() && vehicleType == vehicle.getVehicleType()) {
            parkedVehicle = vehicle;
        } else {
            throw new IllegalArgumentException("Invalid vehicle type or spot is already filled ");
        }
    }

    public synchronized void unParking(Vehicle vehicle) {
        parkedVehicle = null;
    }


    public int getSpotNumber() {
        return spotNumber;
    }

    public Vehicle getVehicle() {
        return parkedVehicle;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
