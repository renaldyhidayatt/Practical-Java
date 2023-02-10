package inheritance.inherintance6.land;

public class TestInheritance {
    public static void main(String[] args) {
        Truck myTruck = new Truck();

        myTruck.setChassisNumber(101);
        myTruck.setColor("GREEN");
        myTruck.setNumberOfDoors(2);
        myTruck.setPlateNumber("EQR-591-CO");
        myTruck.setNumberOfSeats(2);
        myTruck.setDamperVolume(100);

        myTruck.start();
        myTruck.move();
        myTruck.brake();
        myTruck.stop();

        myTruck.damperDown();
        myTruck.damperUp();
    }
}
