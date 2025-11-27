package FlightBooking;

import java.util.Date;
import java.util.Map;

public class FlightReservation {

    private String reservationNumber;
    private FlightSchedule flight;
    private Map<Customer, FlightSeat> seatMap;
    private Date creationDate;
    private ReservationStatus status;

    public FlightReservation(String reservationNumber, FlightSchedule flight, Map<Customer, FlightSeat> seatMap, Date creationDate, ReservationStatus status) {
        this.reservationNumber = reservationNumber;
        this.flight = flight;
        this.seatMap = seatMap;
        this.creationDate = creationDate;
        this.status = status;
    }
}