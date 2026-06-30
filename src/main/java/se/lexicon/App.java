package se.lexicon;

public class App {

    public static void main(String[] args) {

        // Create products
        Product laptop = new Product("Laptop", 1200.00);
        Product mouse = new Product("Wireless Mouse", 40.00);

        // Apply discount
        mouse.applyDiscount(20);

        // Create customer
        Customer customer = new Customer("John Doe", "john@example.com");

        // Create order
        Order order = new Order(customer);

        // Add products
        order.addProduct(laptop);
        order.addProduct(mouse);

        // Print order
        order.printSummary();

        System.out.println();

        // Remove one product
        order.removeProduct(mouse);

        // Print updated order
        order.printSummary();
    }
}