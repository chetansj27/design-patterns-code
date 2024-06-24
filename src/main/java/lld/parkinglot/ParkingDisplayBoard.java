package lld.parkinglot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingDisplayBoard {
    private String id;
    private HatchBackSpot hatchBackFreeSpot;
    private LargeSpot largeFreeSpot;
    private BikeSpot bikeFreeSpot;
    private TruckSpot truckFreeSpot;

    public void showEmptySpotNumber() {
        String message = "";

        if (hatchBackFreeSpot.isSpotAvailable()) {
            message += "Free hatchBack: " + hatchBackFreeSpot.getId();
        } else {
            message += "HatchBack is full";
        }
        message += System.lineSeparator();

        if (largeFreeSpot.isSpotAvailable()) {
            message += "Free Large: " + largeFreeSpot.getId();
        } else {
            message += "Large is full";
        }
        message += System.lineSeparator();

        if (bikeFreeSpot.isSpotAvailable()) {
            message += "Free bike: " + bikeFreeSpot.getId();
        } else {
            message += "Bike is full";
        }
        message += System.lineSeparator();

        if (truckFreeSpot.isSpotAvailable()) {
            message += "Free truck: " + truckFreeSpot.getId();
        } else {
            message += "Truck is full";
        }

        System.out.println(message);
    }
}
