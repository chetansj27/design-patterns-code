package lld.parkinglot;

public abstract class Vehicle {
    private String licenseNumber;
    private ParkingTicket parkingTicket;
    private VehicleType vehicleType;

    public Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void assignTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }
}
