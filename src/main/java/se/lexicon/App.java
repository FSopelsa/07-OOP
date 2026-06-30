package se.lexicon;

public class App {

    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("Welcome to the E-Commerce Application!");
        System.out.println("=====================================");

        // Create customer
        Customer customer = new Customer("John Doe", "john@example.com");
        customer.printInfo();

        // Create products
        Product laptop = new Product("Laptop", 1200.00);
        Product mouse = new Product("Wireless Mouse", 40.00);

        // Create order
        Order order = new Order(customer);

        // Add products
        System.out.println("Adding: ");
        order.addProduct(laptop);
        order.addProduct(mouse);

        // Apply discount
        mouse.applyDiscount(20);

        // Print order
        order.printSummary();

        // Remove one product
        order.removeProduct(mouse);

        // Print updated order
        order.printSummary();
    }
}