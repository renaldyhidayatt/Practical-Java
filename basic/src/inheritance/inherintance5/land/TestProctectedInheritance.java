package inheritance.inherintance5.land;

import inheritance.inherintance5.sea.Boat;

public class TestProctectedInheritance {
    public static void main(String[] args) {
        Vehicle myVehicle= new Vehicle();
        myVehicle.manufacturerTaxNo=100;
        System.out.println(myVehicle.getManufacturerTaxNo());

        Car myCar=new Car();
        myCar.manufacturerTaxNo=150;
        System.out.println(myCar.getManufacturerTaxNo());
        Boat myBoat= new Boat();
        myBoat.manufacturerTaxNo=151;
        System.out.println(myBoat.getManufacturerTaxNo());
    }
}
