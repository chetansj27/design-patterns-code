package lld.elevator.code.model;

public class InternalButton implements Button {
    private InternalDispatcher idispatcher = InternalDispatcher.INSTANCE;

    public InternalButton() {
    }

    @Override
    public void pressButton(int floor, int elevatorId, Direction dir) {
        System.out.println("Pressed floor " + floor + " from elevator " + elevatorId);
        idispatcher.submitRequest(floor, elevatorId, dir);
    }
}
