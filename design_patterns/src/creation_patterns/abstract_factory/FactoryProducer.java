package creation_patterns.abstract_factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean portable) {
        if (portable) {
            return new PortableComputer();
        } else {
            return new ComputerFactory();
        }
    }
}
