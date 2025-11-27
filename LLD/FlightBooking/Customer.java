package FlightBooking;

public class Customer {

    private String name;
    private Address address;
    private String email;
    private String mbNo;

    public Customer(String name, Address address, String email, String mbNo) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.mbNo = mbNo;
    }
}
