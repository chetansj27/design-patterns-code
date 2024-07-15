package lld.elevator.code.model;

import lombok.Getter;

public class ExternalButton implements Button {
    private ExternalDispatcher edispatcher = ExternalDispatcher.INSTANCE;
    @Getter
    private Direction direction;

    public void pressButton(int floor, Direction dir) {
        direction = dir;
        System.out.println("Pressed " + direction + " from floor " + floor);
        edispatcher.submitRequest(floor, dir);
    }

}
