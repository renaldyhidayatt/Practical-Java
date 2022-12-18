package abstract_factory;

import abstract_factory.Computer;

public abstract class AbstractFactory {
    abstract Computer getComputer(String computerType);
}
