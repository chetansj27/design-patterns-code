package lld.elevator.code.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class ElevatorCar {
    private final int id;
    private final Door door;
    private final Display display;
    private final Button button;
    @Setter
    private int currentFloor;
    private final Direction dir;


    public ElevatorCar(int id) {
        this.id = id;
        door = new Door();
        display = new Display();
        currentFloor = 0;
        dir = Direction.IDLE;
        button = new InternalButton();

    }

    public void move(Direction dir, int floor) {
        System.out.println("Elevator " + id + "moving " + dir);
        System.out.println("Elevator " + id + "stops at floor " + floor);
        door.open(id);
        door.close(id);

        //called everytime when currFloor value changes
        setDisplay();

    }

    public void pressButton(int floor) {
        Direction dir = Direction.IDLE;
        if (floor > currentFloor)
            dir = Direction.UP;
        else if (floor < currentFloor)
            dir = Direction.DOWN;
        button.pressButton(floor, id, dir);
    }


    private void setDisplay() {
        display.setFloor(currentFloor);
        display.setDirection(dir);

    }


}
