package lld.elevator.code.model;

public class InternalDispatcher {
    private final ElevatorSystem observer;
    public static InternalDispatcher INSTANCE = new InternalDispatcher();

    public InternalDispatcher() {
        this.observer = ElevatorSystem.INSTANCE;
    }

    public void submitRequest(int elevatorId, int floor, Direction direction) {
        System.out.println("Internal request from elevator " + elevatorId + " to floor " + floor);
        observer.notifyInternalRequest(elevatorId, floor, direction);
    }
}
