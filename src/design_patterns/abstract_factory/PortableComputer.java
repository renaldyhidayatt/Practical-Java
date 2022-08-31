package design_patterns.abstract_factory;

import design_patterns.abstract_factory.Phone;

public class PortableComputer extends AbstractFactory {
    @Override
    Computer getComputer(String computerType) {
        if(computerType.equalsIgnoreCase("Laptop")){
            return new Laptop();
        }
        else if(computerType.equalsIgnoreCase("Phone")){
            return new Phone();
        }

        return null;
    }
}
