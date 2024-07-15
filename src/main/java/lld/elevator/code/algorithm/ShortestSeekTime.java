package lld.elevator.code.algorithm;

import lld.elevator.code.model.Direction;
import lld.elevator.code.model.ElevatorController;

import java.util.List;

public class ShortestSeekTime implements ElevatorControlStrategy {

    @Override
    public void moveElevator(List<ElevatorController> elevatorControllers, int floor, Direction dir) {
        //implemented using min heap which is sorted according to
        //min distance of requested floor from the current floor of elevator
    }
}
