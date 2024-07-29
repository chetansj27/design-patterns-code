package lld.bookmyshow.code;

import lld.bookmyshow.code.models.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Cinema {
    private String name;
    private int totalCinemaHalls;
    private Address location;
    private List<CinemaHall> halls;
}
