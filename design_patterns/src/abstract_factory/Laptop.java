package abstract_factory;

import abstract_factory.Computer;

public class Laptop implements Computer {
    @Override
    public void compute() {
        System.out.println("Laptop computes");
    }
}
