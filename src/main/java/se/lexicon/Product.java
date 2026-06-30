package se.lexicon;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        // TODO: Validate input

        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double percent) {
        // TODO
    }

    public void printInfo() {
        // TODO
    }
}