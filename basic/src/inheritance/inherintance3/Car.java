package inheritance.inherintance3;

public class Car extends Vehicle {
    public String getModifiedName() {
        //we will access super class public members as just accessing the members of this class
        String modifiedName = this.manufacturerName + "_" + getManufacturerFullName();
        return modifiedName.toUpperCase();
    }

    public void testAccessingPrivateFields() {
        //press ctrl+shift+space buttons to see the all accessible fields and methods
        // we can not access private fields  of the super class directly but

    }
}
