package lld.elevator.code.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Floor {
    private int id;
    private Display display;
    private Button upButton;
    private Button downButton;

    public Floor(int id) {
        this.id = id;
        upButton = new ExternalButton();
        downButton = new ExternalButton();
        display = new Display();
    }

    public void pressUpButton() {
        upButton.pressButton(id, Direction.UP);

    }

    public void pressDownButton() {
        downButton.pressButton(id, Direction.DOWN);

    }

    //called everytime selected elevator moves each floor
    private void setDisplay(int floor, Direction direction) {
        display.setDirection(direction);
        display.setFloor(floor);
    }

}