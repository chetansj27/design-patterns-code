package lld.elevator.code.model;

import lombok.Getter;

@Getter
public class ElevatorController {

    private int id;
    private ElevatorCar elevatorCar;


    public ElevatorController(int id) {
        this.id = id;
        elevatorCar = new ElevatorCar(id);
    }

    public void moveToFloor(int floor) {
        Direction dir = elevatorCar.getCurrentFloor() < floor ? Direction.UP : Direction.DOWN;
        elevatorCar.move(dir, floor);
        elevatorCar.setCurrentFloor(floor);
    }


}
