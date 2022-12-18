package structural_patterns.bridge_patterns;

public class Red implements Colour {
    @Override
    public String toString() {
        return getClass().getName().toLowerCase();
    }
}