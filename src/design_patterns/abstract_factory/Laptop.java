package design_patterns.abstract_factory;

import design_patterns.abstract_factory.Computer;

public class Laptop implements Computer {
    @Override
    public void compute() {
        System.out.println("Laptop computes");
    }
}
