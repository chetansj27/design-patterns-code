package lld.bookmyshow.code;

import lld.parkinglot.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CinemaHall {
    private String name;
    private int totalSeats;
    private Address address;
    private List<CinemaHallSeat> seats;
    private List<Show> shows;
}
