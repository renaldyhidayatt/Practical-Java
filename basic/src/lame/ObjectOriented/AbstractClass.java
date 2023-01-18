package lame.ObjectOriented;

abstract class Car {
    abstract void motor();
}

public class AbstractClass extends Car {
    void motor() {
        System.out.println("YOo");
    }

    public static void kentang() {
        AbstractClass toyota = new AbstractClass();
        toyota.motor();
    }
}
