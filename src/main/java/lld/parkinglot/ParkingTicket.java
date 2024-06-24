package lld.parkinglot;

import java.time.LocalDateTime;

public class ParkingTicket {
    private String ticketNumber;
    private LocalDateTime issuedAt;
    private LocalDateTime payedAt;
    private Double amount;
    private TicketStatus status;
}
