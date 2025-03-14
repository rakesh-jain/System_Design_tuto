package parkinglot;

import parkinglot.parking.Building;
import parkinglot.parking.ParkadeImpl;
import parkinglot.parking.ParkingServices;
import parkinglot.vehicle.Bike;
import parkinglot.vehicle.Car;
import parkinglot.vehicle.Vehicle;
import parkinglot.vehicle.VehicleType;

public class ParkingApplication {
    public static void main(String[] args) {
        Building building = new Building(89, 10);
        Vehicle car = new Car("1234xyu", VehicleType.CAR);
        Vehicle bike = new Bike("83487ue", VehicleType.BIKE);

        ParkingServices parkingServices = new ParkadeImpl(building);
        parkingServices.parking(car);
        parkingServices.parking(bike);
        //parkingServices.listAllParked(car);
        parkingServices.listAllAvailableParking(car);
    }
}
