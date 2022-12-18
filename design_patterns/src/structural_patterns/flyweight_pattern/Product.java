package structural_patterns.flyweight_pattern;

public class Product {
    private final String name;

    public Product(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
