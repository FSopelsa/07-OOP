package se.lexicon;

public class Product {

    private String newLine = System.getProperty("line.separator");
    private String name;
    private double price;

    public Product(String name, double price) {

        // Validate input
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }

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
        System.out.println(newLine + "Applying discounts:");
        price = price - (price * percent / 100);
        System.out.println(name + " - " + percent + "% discount = $" + price);
    }

    public void printInfo() {
        System.out.println(name + " - $" + price);
    }
}