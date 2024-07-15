package lld.elevator.code.algorithm;

import lld.elevator.code.model.Direction;
import lld.elevator.code.model.ElevatorController;
import lld.elevator.code.model.PendingRequests;

import java.util.List;

public interface ElevatorSelectionStrategy {
    void addRequest(PendingRequests request);

    PendingRequests getNextRequest();

    boolean hasPendingRequests();

    List<ElevatorController> selectElevators(int floor, Direction dir, List<ElevatorController> elevators);
}
