package FlightBooking;

import java.util.List;

public class Airport {

    private String name;
    private Address address;
    private String code;
    private List<Flight> flightList;

    public Airport(String name, Address address, String code, List<Flight> flightList) {
        this.name = name;
        this.address = address;
        this.code = code;
        this.flightList = flightList;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }
}