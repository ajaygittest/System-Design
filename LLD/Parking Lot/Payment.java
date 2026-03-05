package ParkingLot;

public class Payment {
	
	
	static double calculateFee(long exitTime) {
		
		long currentTime=System.currentTimeMillis();
		
		long duration=currentTime-exitTime;
		
		long hour=duration/(1000*60*60);
		
		if(hour==0) {
			return 10;
		}
		
		return hour*10;
	}
	
	 static void makePayment(double amount) {
	        System.out.println("Payment successful: " + amount);
	    }

}
