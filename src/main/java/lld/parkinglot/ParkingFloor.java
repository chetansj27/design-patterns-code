package lld.parkinglot;

import java.util.HashMap;
import java.util.Objects;

public class ParkingFloor {
    private String name;
    private HashMap<String, HatchBackSpot> hatchBackSpots;
    private HashMap<String, LargeSpot> largeSpots;
    private HashMap<String, BikeSpot> bikeSpots;
    private HashMap<String, TruckSpot> truckSpots;
    private ParkingDisplayBoard displayBoard;
    private int freeHatchBackSpotCount;
    private int freeLargeSpotCount;
    private int freeBikeSpotCount;
    private int freeTruckSpotCount;

    public ParkingFloor(String name) {
        this.name = name;
    }

    public void addParkingSpot(ParkingSpot spot) {
        switch (spot.getVehicleType()) {
            case HATCHBACK:
                freeHatchBackSpotCount++;
                hatchBackSpots.put(spot.getId(), (HatchBackSpot) spot);
                break;
            case LARGE:
                freeLargeSpotCount++;
                largeSpots.put(spot.getId(), (LargeSpot) spot);
                break;
            case BIKE:
                freeBikeSpotCount++;
                bikeSpots.put(spot.getId(), (BikeSpot) spot);
                break;
            case TRUCK:
                freeTruckSpotCount++;
                truckSpots.put(spot.getId(), (TruckSpot) spot);
                break;
            default:
                System.out.println("Wrong parking spot type!");
        }
    }

    public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot spot) {
        spot.assignVehicle(vehicle);
        switch (spot.getVehicleType()) {
            case HATCHBACK:
                freeHatchBackSpotCount--;
                updateDisplayBoardForHatchBack(spot);
                break;
            case LARGE:
                freeLargeSpotCount--;
                updateDisplayBoardForLarge(spot);
                break;
            case BIKE:
                freeBikeSpotCount--;
                updateDisplayBoardForBike(spot);
                break;
            case TRUCK:
                freeTruckSpotCount--;
                updateDisplayBoardForTruck(spot);
                break;
            default:
                System.out.println("Wrong parking spot type!");
        }
    }

    private void updateDisplayBoardForHatchBack(ParkingSpot spot) {
        if (Objects.equals(this.displayBoard.getHatchBackFreeSpot().getId(), spot.getId())) {
            for (String key : hatchBackSpots.keySet()) {
                if (hatchBackSpots.get(key).isSpotAvailable()) {
                    this.displayBoard.setHatchBackFreeSpot(hatchBackSpots.get(key));
                }
            }
            this.displayBoard.showEmptySpotNumber();
        }
    }

    private void updateDisplayBoardForLarge(ParkingSpot spot) {
        if (Objects.equals(this.displayBoard.getLargeFreeSpot().getId(), spot.getId())) {
            for (String key : largeSpots.keySet()) {
                if (largeSpots.get(key).isSpotAvailable()) {
                    this.displayBoard.setLargeFreeSpot(largeSpots.get(key));
                }
            }
            this.displayBoard.showEmptySpotNumber();
        }
    }

    private void updateDisplayBoardForBike(ParkingSpot spot) {
        if (Objects.equals(this.displayBoard.getBikeFreeSpot().getId(), spot.getId())) {
            for (String key : bikeSpots.keySet()) {
                if (bikeSpots.get(key).isSpotAvailable()) {
                    this.displayBoard.setBikeFreeSpot(bikeSpots.get(key));
                }
            }
            this.displayBoard.showEmptySpotNumber();
        }
    }

    private void updateDisplayBoardForTruck(ParkingSpot spot) {
        if (Objects.equals(this.displayBoard.getTruckFreeSpot().getId(), spot.getId())) {
            for (String key : truckSpots.keySet()) {
                if (truckSpots.get(key).isSpotAvailable()) {
                    this.displayBoard.setTruckFreeSpot(truckSpots.get(key));
                }
            }
            this.displayBoard.showEmptySpotNumber();
        }
    }

    public void freeSpot(ParkingSpot spot) {
        spot.removeVehicle();
        switch (spot.getVehicleType()) {

            case HATCHBACK:
                freeHatchBackSpotCount++;
                break;
            case LARGE:
                freeLargeSpotCount++;
                break;
            case BIKE:
                freeBikeSpotCount++;
                break;
            case TRUCK:
                freeTruckSpotCount++;
                break;
            default:
                System.out.println("Wrong parking spot type!");
        }
    }

}
