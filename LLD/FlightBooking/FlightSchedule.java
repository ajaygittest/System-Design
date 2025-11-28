package FlightBooking;

import java.util.Date;
import java.util.List;

public class FlightSchedule {

    private Flight flight;
    private Date departureTime;
    private String gate;
    private FlightStatus status;
    private List<FlightSeat> fseats;

    public FlightSchedule(Flight flight, Date departureTime, String gate, FlightStatus status, List<FlightSeat> fseats) {
        this.flight = flight;
        this.departureTime = departureTime;
        this.gate = gate;
        this.status = status;
        this.fseats = fseats;
    }
}