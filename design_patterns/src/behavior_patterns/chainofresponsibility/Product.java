package behavior_patterns.chainofresponsibility;

public class Product {
    private final String name;

    public Product(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
