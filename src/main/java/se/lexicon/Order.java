package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        // TODO
    }

    public void removeProduct(Product product) {
        // TODO
    }

    public double calculateTotal() {
        // TODO
        return 0;
    }

    public void printSummary() {
        // TODO
    }
}