
class Customer {
	private String id;
    private String name;
    private ShoppingCart cart;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
        this.cart = new ShoppingCart();
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    // Add product to cart
    public void addToCart(Product product) {
        cart.addProduct(product);
    }

    // Remove product from cart
    public void removeFromCart(Product product) {
        cart.removeProduct(product);
    }

    // Checkout
    public double checkout() {
        double totalPrice = cart.calculateTotalPrice();
        // Implement payment process here
        return totalPrice;
    }

}
