package ParkingLot;

public class ParkingSpot {

	
	int spotId;
	
	boolean isOccupied;
	
	Vechicle vechicle;
	
	
	public ParkingSpot(int spotId) {
		this.spotId=spotId;
		this.isOccupied=false;
	}
	
	
	public void parkVechile(Vechicle vechicle) {
		this.vechicle=vechicle;
		this.isOccupied=true;
	}
	
	
	public void removeVechicle() {
		this.vechicle=null;
		this.isOccupied=false;
	}
}


