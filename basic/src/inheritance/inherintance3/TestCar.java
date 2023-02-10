package inheritance.inherintance3;

public class TestCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setChassisNumber(100);
        myCar.setColor("RED");
        myCar.setNumberOfDoors(2);
        myCar.setPlateNumber("EQR-590-CO");
        myCar.setNumberOfSeats(4);

        System.out.println(myCar.getChassisNumber());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getNumberOfDoors());
        System.out.println(myCar.getNumberOfSeats());
        System.out.println(myCar.getPlateNumber());

        Truck myTruck = new Truck();
        myTruck.setChassisNumber(101);
        myTruck.setColor("GREEN");
        myTruck.setNumberOfDoors(2);
        myTruck.setPlateNumber("EQR-591-CO");
        myTruck.setNumberOfSeats(2);

        System.out.println(myTruck.getChassisNumber());
        System.out.println(myTruck.getColor());
        System.out.println(myTruck.getNumberOfDoors());
        System.out.println(myTruck.getNumberOfSeats());
        System.out.println(myTruck.getPlateNumber());
    }
}
