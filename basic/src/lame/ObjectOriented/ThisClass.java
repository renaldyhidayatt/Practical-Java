package lame.ObjectOriented;

public class ThisClass {
    ThisClass() {

    }

    public void hello() {
        System.out.println("Bisa");
    }

    public void motor() {
        System.out.println("This is all about this");
        this.hello();
        this.hello();
    }

    public static void kentang() {
        ThisClass move = new ThisClass();
        move.motor();
    }
}
