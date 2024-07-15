package lld.elevator.code.model;

import lld.elevator.code.algorithm.ElevatorControlStrategy;
import lld.elevator.code.algorithm.ElevatorSelectionStrategy;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ElevatorSystem {
    private List<ElevatorController> elevatorControllerList = new ArrayList<>();
    public static ElevatorControlStrategy elevatorControlStrategy;
    public static ElevatorSelectionStrategy elevatorSelectionStrategy;
    public List<Floor> floors = new ArrayList<>();

    public static ElevatorSystem INSTANCE = new ElevatorSystem();

    private ElevatorSystem() {

    }

    public void addElevator(ElevatorController e) {
        elevatorControllerList.add(e);
    }

    public void removeElevator(ElevatorController e) {
        elevatorControllerList.remove(e);
    }

    public void setElevatorControlStrategy(ElevatorControlStrategy elevatorControlStrategy) {
        this.elevatorControlStrategy = elevatorControlStrategy;
    }

    public void setElevatorSelectionStrategy(ElevatorSelectionStrategy elevatorSelectionStrategy) {
        this.elevatorSelectionStrategy = elevatorSelectionStrategy;
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public void notifyRequest(int floor, Direction dir) {
        elevatorSelectionStrategy.addRequest(new PendingRequests(floor, dir, null));
        processNextRequest();
    }

    public void notifyInternalRequest(int elevatorId, int floor, Direction direction) {
        elevatorSelectionStrategy.addRequest(new PendingRequests(floor, direction, elevatorId));
        processNextRequest();
    }

    private void processNextRequest() {
        if (elevatorSelectionStrategy.hasPendingRequests()) {
            PendingRequests request = elevatorSelectionStrategy.getNextRequest();
            List<ElevatorController> potentialElevators = elevatorSelectionStrategy.selectElevators(request.getFloor(), request.getDirection(), elevatorControllerList);
            elevatorControlStrategy.moveElevator(potentialElevators, request.getFloor(), request.getDirection());
        }
    }
}
