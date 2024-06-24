package lld.parkinglot;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class ParkingSpot {
    private String id;
    private boolean spotAvailable;
    private Vehicle vehicle;
    private VehicleType vehicleType;

    public ParkingSpot(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        spotAvailable = false;
        return true;
    }

    public boolean removeVehicle() {
        this.vehicle = null;
        spotAvailable = true;
        return true;
    }

}
