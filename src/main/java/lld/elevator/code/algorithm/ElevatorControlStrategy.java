package lld.elevator.code.algorithm;

import lld.elevator.code.model.Direction;
import lld.elevator.code.model.ElevatorController;

import java.util.List;


public interface ElevatorControlStrategy {
    void moveElevator(List<ElevatorController> elevatorControllers, int floor, Direction dir);
}
