package inheritance.inherintance5.sea;

import inheritance.inherintance5.land.Vehicle;

public class Boat extends Vehicle {
    public void testAcceesingDefaultMembers() {}

    public void testAccessingProtectedMembers() {
       
        System.out.println(manufacturerTaxNo);
        setManufacturerTaxNo(100);
        System.out.println(getManufacturerTaxNo());
    }
}
