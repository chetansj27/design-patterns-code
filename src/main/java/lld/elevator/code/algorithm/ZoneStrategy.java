package lld.elevator.code.algorithm;

import lld.elevator.code.model.Direction;
import lld.elevator.code.model.ElevatorController;
import lld.elevator.code.model.PendingRequests;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZoneStrategy implements ElevatorSelectionStrategy {
    private Queue<PendingRequests> requestQueue;

    public ZoneStrategy() {
        requestQueue = new LinkedList<>();
    }

    @Override
    public void addRequest(PendingRequests request) {
        requestQueue.add(request);
    }

    @Override
    public PendingRequests getNextRequest() {
        return requestQueue.poll();
    }

    @Override
    public boolean hasPendingRequests() {
        return !requestQueue.isEmpty();
    }

    @Override
    public List<ElevatorController> selectElevators(int floor, Direction dir, List<ElevatorController> elevators) {
        return elevators;
    }
}
