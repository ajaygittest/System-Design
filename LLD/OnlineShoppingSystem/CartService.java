package OnlineShoppingSystem;
public class CartService {

    public Cart createCart(String userId) {
        return new Cart(userId);
    }

    public void addToCart(Cart cart, Product p, int qty) {
        cart.addItem(p, qty);
    }
}
