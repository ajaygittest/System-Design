package OnlineShoppingSystem;
public class OrderService {

    public Order placeOrder(String userId, Cart cart, Address address) {
        // reduce product stock
        for (CartItem item : cart.getItems()) {
            item.product.reduceStock(item.quantity);
        }

        double total = cart.getCartTotal();

        return new Order(
                "ORD" + System.currentTimeMillis(),
                userId,
                cart.getItems(),
                total,
                address
        );
    }
}
