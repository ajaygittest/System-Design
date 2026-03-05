package ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {

	List<ParkingSpot> spot = new ArrayList<>();

	Map<Integer, Ticket> tickets = new HashMap<>();
	int ticketCounter = 1;

	ParkingLot(int totalSpots) {

		for (int i = 1; i <= totalSpots; i++) {

			spot.add(new ParkingSpot(i));
		}
	}

	Ticket parkVechile(Vechicle v) {

		for (ParkingSpot spot : this.spot) {

			if (!spot.isOccupied) {

				spot.parkVechile(v);
				Ticket ticket = new Ticket(this.ticketCounter++, v, spot);
				tickets.put(ticketCounter, ticket);
				System.out.println("Vechicle is Parking. Spot: " + spot.spotId);
				return ticket;
			}

		}
		System.out.println("Parking Lot is Full");
		return null;
	}

	void exitVechicle(int ticketId) {
		Ticket ticket = tickets.get(ticketId);
		
		if(ticket ==null) {
			System.out.println("Invalid Ticket");
		}
		
		
		double fee=Payment.calculateFee(ticket.entryTime);
		Payment.makePayment(fee);
		ticket.spot.removeVechicle();
		tickets.remove(ticketId);
		  System.out.println("Vehicle Exited from Spot: " + ticket.spot.spotId);
		
	}

}
