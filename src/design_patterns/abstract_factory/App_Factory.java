package design_patterns.abstract_factory;

public class App_Factory {
    public static void kentang(){
        AbstractFactory computerFactory = FactoryProducer.getFactory(false);
        Computer computer = computerFactory.getComputer("Laptop");
        computer.compute();
    }
}
