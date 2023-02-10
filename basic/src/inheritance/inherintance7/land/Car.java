package inheritance.inherintance7.land;

public class Car extends Vehicle {
    public String getModifiedName() {
        String modifiedName = manufacturerName + "_" + getManufacturerFullName();
        return modifiedName.toUpperCase();
    }

    public void testAccessingPrivateFields() {

    }

    public void testAcceesingDefaultMembers() {
        System.out.println(tireSize);
        setTireSize(100);
        System.out.println(getTireSize());
    }

    public void testAccessingProtectedMembers() {
        System.out.println(manufacturerTaxNo);
        setManufacturerTaxNo(100);
        System.out.println(getManufacturerTaxNo());
    }

    @Override
    public void start() {

        System.out.println("Car is starting.");
    }

}
