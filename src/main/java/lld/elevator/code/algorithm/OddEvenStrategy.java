package lld.elevator.code.algorithm;

import lld.elevator.code.model.Direction;
import lld.elevator.code.model.ElevatorController;
import lld.elevator.code.model.PendingRequests;

import java.util.List;

public class OddEvenStrategy implements ElevatorSelectionStrategy {

    @Override
    public void addRequest(PendingRequests request) {

    }

    @Override
    public PendingRequests getNextRequest() {
        return null;
    }

    @Override
    public boolean hasPendingRequests() {
        return false;
    }

    @Override
    public List<ElevatorController> selectElevators(int floor, Direction dir, List<ElevatorController> elevators) {
        return null;
    }
}
