package structural_patterns.bridge_patterns;

public class Blue implements Colour {
    @Override
    public String toString() {
        return getClass().getName().toLowerCase();
    }
}