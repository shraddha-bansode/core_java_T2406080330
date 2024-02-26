
public class OnlineShoppingApp {
	public static void main(String[] args) {
        // Create some sample products
        Product product1 = new Product("1", "Laptop", 999.99);
        Product product2 = new Product("2", "Smartphone", 599.99);
        Product product3 = new Product("3", "Headphones", 99.99);

        // Create a customer
        Customer customer = new Customer("C001", "John Doe");

        // Add products to the customer's cart
        customer.addToCart(product1);
        customer.addToCart(product2);
        customer.addToCart(product3);

        // Checkout
        double totalPrice = customer.checkout();
        System.out.println("Total price: $" + totalPrice);
    }

}
