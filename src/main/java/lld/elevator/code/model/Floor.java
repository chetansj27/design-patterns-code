package lld.elevator.code.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Floor {
    private int id;
    private Display display;
    private Button button;

    public Floor(int id)
    {
        this.id= id;
        button= new ExternalButton();
    }

    public void pressButton(Direction dir)
    {
        button.pressButton(id, dir);

    }

    //called everytime selected elevator moves each floor
    private  void setDisplay(int floor, Direction direction)
    {
        display.setDirection(direction);
        display.setFloor(floor);
    }

}