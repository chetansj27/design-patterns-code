package lld.parkinglot;

public abstract class ParkingSpot {
    private String id;
    private boolean spotAvailable;
    private Vehicle vehicle;
    private VehicleType vehicleType;

    public boolean isSpotAvailable() {
        return spotAvailable;
    }

    public ParkingSpot(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        spotAvailable = false;
        return true;
    }

    public boolean removeVehicle(Vehicle vehicle) {
        this.vehicle = null;
        spotAvailable = true;
        return true;
    }

}
