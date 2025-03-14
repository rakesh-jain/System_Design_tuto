package parkinglot.parking;

import parkinglot.vehicle.Vehicle;

public interface ParkingServices {
    abstract void availables(Vehicle vehicle);
    abstract void parking(Vehicle vehicle);
    abstract void unparking(Vehicle vehicle);
    abstract void listAllParked(Vehicle vehicle);
    abstract void listAllAvailableParking(Vehicle vehicle);
}


