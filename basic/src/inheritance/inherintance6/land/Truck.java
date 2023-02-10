package inheritance.inherintance6.land;

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
}
