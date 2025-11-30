package OnlineShoppingSystem;
import java.util.*;

public class Cart {
    private String userId;
    private List<CartItem> items = new ArrayList<>();

    public Cart(String userId) {
        this.userId = userId;
    }

    public void addItem(Product p, int qty) {
        items.add(new CartItem(p, qty));
    }

    public double getCartTotal() {
        return items.stream().mapToDouble(CartItem::getTotal).sum();
    }

    public List<CartItem> getItems() {
        return items;
    }
}
