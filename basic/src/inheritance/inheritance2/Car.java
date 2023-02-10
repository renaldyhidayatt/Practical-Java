package inheritance.inheritance2;

public class Car extends Vehicle {

    public String getModifiedName(){
        String modifiedName = this.manufactureName + "_" + getManufacturerFullName();
        return modifiedName.toUpperCase();
    }
    
}
