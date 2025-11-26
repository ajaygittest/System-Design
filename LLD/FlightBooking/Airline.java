package FlightBooking;

import java.util.List;

public class Airline {

    private String name;
    private String code;
    private List<Flight> flights;

    public Airline(String name, String code, List<Flight> flights) {
        this.name = name;
        this.code = code;
        this.flights = flights;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
