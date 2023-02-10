package inheritance.inherintance6.sea;

import inheritance.inherintance6.land.Vehicle;

public class Boat extends Vehicle {
    public void testAcceesingDefaultMembers() {
     
    }

    public void testAccessingProtectedMembers() {
      
        System.out.println(manufacturerTaxNo);
        setManufacturerTaxNo(100);
        System.out.println(getManufacturerTaxNo());
    }
}
