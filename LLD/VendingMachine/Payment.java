package VendingMachine;

public class Payment {
	
	
	static boolean makePayment(int moneyInserted,int price) {
		
		if(moneyInserted>=price) {
			
			int chance=moneyInserted-price;
			
			System.out.println("Payment SuccessFull");
			if(chance>0) {
				System.out.println("Changed refunded: "+chance);
			}
			
			return true;
		}
		
		System.out.println("Insufficent amount ");
		return false;
	}

}
