package design_patterns.abstract_factory;

import design_patterns.abstract_factory.Computer;

public abstract class AbstractFactory {
    abstract Computer getComputer(String computerType);
}
