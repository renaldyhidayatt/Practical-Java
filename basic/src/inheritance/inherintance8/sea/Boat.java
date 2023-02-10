package inheritance.inherintance8.sea;

import inheritance.inherintance8.land.Vehicle;

public class Boat extends Vehicle {
    public void testAcceesingDefaultMembers() {
    }

    
    public void testAccessingProtectedMembers() {
        System.out.println(manufacturerTaxNo);
        setManufacturerTaxNo(100);
        System.out.println(getManufacturerTaxNo());
    }


    @Override
    public void start() {
       
        System.out.println("Boat is starting.");
    }

    @Override
    public void move() {
        System.out.println("Fuel level is checking");
        super.move();
    }
}
