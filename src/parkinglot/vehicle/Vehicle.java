package parkinglot.vehicle;

public abstract class Vehicle{
    protected String vehicleplateNum;
    protected VehicleType vehicleType;

    public Vehicle(String vehicleplateNum, VehicleType vehicleType) {
        this.vehicleplateNum = vehicleplateNum;
        this.vehicleType = vehicleType;
    }

    public String getVehicleplateNum() {
        return vehicleplateNum;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
