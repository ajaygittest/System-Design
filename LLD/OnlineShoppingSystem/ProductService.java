package OnlineShoppingSystem;
import java.util.*;

public class ProductService {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public Product getProduct(String id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public void showAllProducts() {
        products.forEach(System.out::println);
    }
}
