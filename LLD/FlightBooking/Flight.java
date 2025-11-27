package FlightBooking;

import java.util.List;

public class Flight {

    private String flightNo;
    private int duration;
    private Airport departure;
    private Airport arrival;
    private List<Seat> seats;

    public Flight(String flightNo, int duration, Airport departure, Airport arrival, List<Seat> seats) {
        this.flightNo = flightNo;
        this.duration = duration;
        this.departure = departure;
        this.arrival = arrival;
        this.seats = seats;
    }
}
