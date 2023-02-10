package inheritance.inherintance8.land;

public class Vehicle {
    public String manufacturerName = "GGM";
    private int chassisNumber;
    private int numberOfDoors;
    private int numberOfSeats;
    private String color;
    private String plateNumber;
    int tireSize;

    protected int  manufacturerTaxNo;

    protected int getManufacturerTaxNo() {
        return manufacturerTaxNo;
    }

    protected void setManufacturerTaxNo(int manufacturerTaxNo) {
        this.manufacturerTaxNo = manufacturerTaxNo;
    }

    int getTireSize() {
        return tireSize;
    }

    void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }
     public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }


    public int getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(int chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getManufacturerFullName() {
        return "Garry Green Motors Corp.";
    }


    public void start(){
        System.out.println("Engine started");
    }
    public void stop(){
        System.out.println("Engine stopped");
    }
    public void move(){
        System.out.println("Vehicle is moving");
    }
    public void brake(){
        System.out.println("Vehicle is braking");
    }
}
