package lld.elevator.code.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PendingRequests {
    private int floor;
    private Direction direction;
    private Integer elevatorId;
}
