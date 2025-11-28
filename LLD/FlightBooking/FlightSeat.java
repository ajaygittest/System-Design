package FlightBooking;

public class FlightSeat extends Seat {

    private int fare;
    private BookingStatus bookingStatus;

    public FlightSeat(String seatNumber, SeatClass sclass, int fare, BookingStatus bookingStatus) {
        super(seatNumber, sclass);
        this.fare = fare;
        this.bookingStatus = bookingStatus;
    }
}
