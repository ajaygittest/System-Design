package VendingMachine;

public class Slot {
	
	
	int soltId;
	
	Product product;
	
	int quantity;
	
	public Slot(int soltId, Product product, int quantity) {
		
		this.soltId=soltId;
		this.product=product;
		this.quantity=quantity;
	}
	
	
	boolean isAvailable() {
		
		return this.quantity>0;
	}

	
	void dispenseProduct() {
		
		if(this.quantity>0) {
			this.quantity--;
		}
	}
}
