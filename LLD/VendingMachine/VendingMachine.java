package VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

	
	
	Map<Integer, Slot> slots=new HashMap<>();
	
	  VendingMachine() {

	        slots.put(1, new Slot(1, new Product("Coke", 30), 5));
	        slots.put(2, new Slot(2, new Product("Pepsi", 25), 5));
	        slots.put(3, new Slot(3, new Product("Water", 20), 5));
	    }
	  
	  
	  void display() {
		  
		  for(Slot slot:slots.values()) {
		  System.out.println(
				  
				  "Slot: "+slot.soltId+
				  " Product: "+slot.product.name+
				  " Price: "+slot.product.price+
				  " Quantity: "+slot.quantity
				  );
		  
		  }
	  }
	  
	  void selectProduct(int slotId,int moneyInserted) {
		  Slot slot=slots.get(slotId);
		  
		  if(slot ==null) {
			  System.out.println("Invalid Slot");
			  return;
		  }
		  
		  if(!slot.isAvailable()) {
			  System.out.println("Out of stock");
			  return;
		  }
		  
		  boolean paymentStatus=Payment.makePayment(moneyInserted, slot.product.price);
		  
		  if(paymentStatus) {
			  slot.dispenseProduct();
			  System.out.println("Product dispensed: " + slot.product.name);
		  }
	  }
}
