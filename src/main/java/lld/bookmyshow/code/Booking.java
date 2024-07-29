package lld.bookmyshow.code;

import lld.bookmyshow.code.models.BookingStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Getter
@AllArgsConstructor
public class Booking {
    private String bookingNumber;
    private int numberOfSeats;
    private Date createdOn;
    private BookingStatus status;
    private Show show;
    private List<ShowSeat> seats;
    private Payment payment;

    public boolean makePayment(Payment payment){

    }
    public boolean cancel(){

    }
    public boolean assignSeats(List<ShowSeat> seats){

    }
}
