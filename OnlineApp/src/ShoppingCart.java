import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    // Add product to cart
    public void addProduct(Product product) {
        items.add(product);
    }

    // Remove product from cart
    public void removeProduct(Product product) {
        items.remove(product);
    }

    // Calculate total price of items in cart
    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Product item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

}
