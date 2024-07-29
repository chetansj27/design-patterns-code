package lld.bookmyshow.code;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    List<Booking> bookings = new ArrayList<>();

    public boolean makeBooking(Booking booking) {
        return bookings.add(booking);
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
