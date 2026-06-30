package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class Order {

    String newLine = System.getProperty("line.separator");

    private final Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("--- " + product.getName() + " - $" + product.getPrice());
    }

    public void removeProduct(Product product) {
        System.out.println("Removing product: " + product.getName() + " - $" + product.getPrice());
        products.remove(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void printSummary() {
        System.out.println(newLine + "-------------------------");
        System.out.println("Order Summary:");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");
        for (Product product : products) {
            product.printInfo();
        }
        System.out.println("Total: $ " + calculateTotal());
        System.out.println("-------------------------" + newLine);
    }
}