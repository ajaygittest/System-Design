package OnlineShoppingSystem;
import java.util.*;

public class Order {
    private String orderId;
    private String userId;
    private List<CartItem> items;
    private double amount;
    private String status;
    private Address address;

    public Order(String orderId, String userId, List<CartItem> items, double amount, Address address) {
        this.orderId = orderId;
        this.userId = userId;
        this.items = items;
        this.amount = amount;
        this.address = address;
        this.status = "CREATED";
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public String getStatus() { return status; }

    @Override
    public String toString() {
        return "Order: " + orderId + ", Amount=" + amount + ", Status=" + status;
    }
}
