package lld.parkinglot;

public abstract class Vehicle {
    private String licenseNumber;
    private ParkingTicket parkingTicket;
    private final VehicleType vehicleType;

    protected Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
