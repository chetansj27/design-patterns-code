package lld.elevator.code.model;

public interface Button {
    //for External Button
    default void pressButton(int floor, Direction dir) {
    }

    //for Internal Button
    default void pressButton(int floor, int elevatorId, Direction dir) {
    }
}
