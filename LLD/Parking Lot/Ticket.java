package ParkingLot;

public class Ticket {
	
	
	int ticketId;
	
	Vechicle vechicle;
	long entryTime;
	ParkingSpot spot;
	
	Ticket(int ticketId, Vechicle vechicle,ParkingSpot spot){
		this.ticketId=ticketId;
		this.vechicle=vechicle;
		this.spot=spot;
		this.entryTime=System.currentTimeMillis();
	}

}
