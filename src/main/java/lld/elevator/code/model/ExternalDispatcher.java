package lld.elevator.code.model;

public class ExternalDispatcher {
    ElevatorSystem observer;
    public static ExternalDispatcher INSTANCE = new ExternalDispatcher();

    public ExternalDispatcher() {
        this.observer = ElevatorSystem.INSTANCE;
    }


    public void submitRequest(int floor, Direction dir) {
        observer.notifyRequest(floor, dir);
    }
}
