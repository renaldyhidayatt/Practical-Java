package inheritance.inheritance2;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        System.out.println(myVehicle.manufactureName);
        System.out.println(myVehicle.getManufacturerFullName());

        Car myCar = new Car();

        System.out.println(myCar.manufactureName);
        System.out.println(myCar.getManufacturerFullName());

        Truck myTruck = new Truck();

        System.out.println(myTruck.manufactureName);
        System.out.println(myTruck.getManufacturerFullName());
    }
}
