package design_patterns.abstract_factory;

public class Phone implements Computer {
    @Override
    public void compute() {
        System.out.println("Phone computes");
    }
}
