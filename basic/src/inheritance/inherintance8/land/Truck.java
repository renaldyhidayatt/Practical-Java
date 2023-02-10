package inheritance.inherintance8.land;

public class Truck extends Vehicle {
    private int damperVolume;
    public int getDamperVolume() {
        return damperVolume;
    }

    public void setDamperVolume(int damperVolume) {
        this.damperVolume = damperVolume;
    }

    public void damperUp() {
        System.out.println("Damper is up");
    }

    public void damperDown() {
        System.out.println("Damper is down");
    }

    @Override
    public void start(){
        
        System.out.println("Truck is starting.");
    }

    public void testSuperKeyword(){
      
        super.start();
        System.out.println(super.tireSize);
    }

}
