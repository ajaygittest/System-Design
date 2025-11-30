package OnlineShoppingSystem;
public class CartItem {
    Product product;
    int quantity;

    public CartItem(Product p, int qty) {
        this.product = p;
        this.quantity = qty;
    }

    public double getTotal() {
        return product.getPrice() * quantity;
    }
}
